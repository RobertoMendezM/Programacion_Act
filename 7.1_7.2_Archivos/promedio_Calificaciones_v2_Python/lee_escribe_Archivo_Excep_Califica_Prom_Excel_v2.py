# -*- coding: utf-8 -*-
"""
Lee el archivo de calificaciones y saca el promedio, 
realizando previamente a una serie de verificaciones y manejo de posibles
excepciones. 

Curso: Programación 

Tema: Manejo de Dataframes, try-Exception, escritura a archivo en excel

@author: Deepseek 
Editor:  Roberto Méndez
Created  May 27  2026
"""

import pandas as pd

def calcular_promedios_excel(archivo_entrada, archivo_salida=None):
    """
    Calcula el promedio de 3 periodos y lo escribe en la columna 'promedio'
    
    Parámetros:
    archivo_entrada: nombre del archivo Excel de entrada
    archivo_salida: nombre del archivo Excel de salida (opcional)
    """
    
    try:
        # Leer archivo
        df = pd.read_excel(archivo_entrada)
        
        print("Columnas encontradas:", list(df.columns))
        
        # Verificar estructura
        if len(df.columns) < 4:
            print("Error: El archivo debe tener al menos 4 columnas")
            return False
        
        # Asignar nombres genéricos si no tienen nombres específicos
        if 'nombre' not in df.columns:
            df.rename(columns={df.columns[0]: 'nombre'}, inplace=True)
        
        # Identificar columnas de calificaciones
        cols_calif = [col for col in df.columns if col != 'nombre']
        if len(cols_calif) < 3:
            print("Error: Se necesitan al menos 3 columnas de calificaciones")
            return False
        
        # Tomar las primeras 3 columnas de calificaciones
        periodo1, periodo2, periodo3 = cols_calif[:3]
        
        print(f"Calculando promedio usando: {periodo1}, {periodo2}, {periodo3}")
        
        # Calcula promedio y lo redondea a dos cifras decimales 
        df['Promedio'] = (df[periodo1] + df[periodo2] + df[periodo3]) / 3
        df['Promedio'] = df['Promedio'].round(2)
        
        # Ordena las columnas en: nombre, 3 periodos, promedio
        columnas_orden = ['nombre', periodo1,  periodo2, periodo3, 'Promedio']
        df = df[columnas_orden]
        
        # Guardar resultado
        if archivo_salida is None:
            archivo_salida = archivo_entrada.replace('.xlsx', 
                                                     '_con_promediov2.xlsx')
        
        df.to_excel(archivo_salida, index=False)
        
        # Mostrar resultados
        print("\n" + "="*50)
        print("RESULTADOS:")
        print("="*50)
        for _, row in df.iterrows():
            print(f"{row['nombre']}: {row[periodo1]}, {row[periodo2]}, {row[periodo3]} → Promedio: {row['Promedio']}")      
        
        print(f"\n✓ Archivo guardado: {archivo_salida}")
        return True
        
    except FileNotFoundError:
        print(f"Error: No se encuentra el archivo '{archivo_entrada}'")
        return False
    except Exception as e:
        print(f"Error inesperado: {e}")
        return False

# Ejecutar
if __name__ == "__main__":
    # Usar tu archivo específico
    
    #Sin dar archivo de salida
    calcular_promedios_excel('calificaciones2.xlsx')
    
    #Especifico nombre de archivo de salida
    calcular_promedios_excel('calificaciones2.xlsx', 'Si_di_nombre_Califica_Prom.xlsx')