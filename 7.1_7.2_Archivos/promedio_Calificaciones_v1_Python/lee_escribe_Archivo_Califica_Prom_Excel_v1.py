# -*- coding: utf-8 -*-
"""
Lee el archivo de calificaciones y saca el promedio

Curso: Programación 

Tema: Manejo de Dataframes

@author: Deepseek 
Editor:  Roberto Méndez
Created  May 27  2026
"""

import pandas as pd

# Leer el archivo Excel
archivo = 'calificaciones.xlsx'
df = pd.read_excel(archivo)

# Calcular el promedio de las 3 calificaciones
# Suponiendo que las columnas  de las calificaciones  se llaman
# 'Periodo1', 'Periodo2', 'Periodo3'
df['Promedio'] = (df['Periodo1'] + df['Periodo2'] + df['Periodo3']) / 3

# Redondear el promedio a 2 decimales
df['Promedio'] = df['Promedio'].round(2)

# Guardar el archivo actualizado
df.to_excel('calificaciones_con_promedio.xlsx', index=False)

print("Promedios calculados y guardados exitosamente")
print("\nDatos actualizados:")
print(df)

