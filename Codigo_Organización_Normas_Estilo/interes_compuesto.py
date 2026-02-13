"""
===========================================================
Autor: Enrique de Jesús Soriano Mejía
Materia: Programación
Grupo: 9157
Tema: Organización general de un programa
        Entrada -> Proceso -> Salida
Fecha: 2026-02-12
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Programa que calcula el Interés Compuesto

Modelo empleado:
         M = P x (1 + r/n) ^ (n*t)

    Variables:
        P -> Capital Inicial
        r -> Tasa de interés anual
        n -> Número de capitalizaciones por año
        t -> Número de años
"""

print("\n---- CALCULADORA DE INTERÉS COMPUESTO ----")

#Entrada/Input de datos
# Es donde pedimos al usuario ingrese el valor de nuestras variables
capital = float(input("Introduzca su capital inicial: $"))
tasa_anual = float(input("Introduzca su tasa de interés anual (%): "))
capitalizaciones = int(input("Introduzca sus capitalizaciones por año (1 = anual, 12 = mensual): "))
años = int(input("Introduzca sus años de inversión: "))


####################################################################
#Proceso
# Calculamos la tasa decimal
tasa_decimal = tasa_anual/100

# Evaluamos nuestro modelo
monto_final = capital * (1+ (tasa_decimal / capitalizaciones)) ** (capitalizaciones * años)

####################################################################

# Salida/Output de datos
print("\n=== RESULTADOS ===")
print("Capital Inicial:", capital)
print("Tasa Anual:", tasa_anual)
print("Periodo:" + str(años) + " años")
print("Capitalizaciones por año:", capitalizaciones)
print("Monto Final:", monto_final)
print("Interés Ganado:", monto_final-capital)