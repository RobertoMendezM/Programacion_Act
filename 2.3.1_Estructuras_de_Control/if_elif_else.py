"""
===========================================================
Autor: Enrique de Jesús Soriano Mejía
Materia: Programación
Grupo: 9157
Tema: Estructuras de control - if - elif - else
Fecha: 2026-02-24
===========================================================
OBJETIVO DEL SCRIPT

Entender cómo una computadora puede tomar decisiones usando if, elif, else.
No todos los programas hacen los mismo siempre. Hay ocasiones en las que
necesitan decidir.
===========================================================

¿Qué es una estructura de control?

Una estructura de control es algo que controla el flujo del programa.
Sin estructura de control, el código se ejecuta linea por linea sin 
decidir nada.

Es como una carretera sin desviaciones.
"""

################### PASO 1 ###################
"Si se cumple una condición, entonces haz algo"

edad = 20

if edad >= 18:
    print("Eres mayor de edad")

"""
-> edad >= 18 es una condición (True or False)
    - Si es True -> se ejecuta el bloque
    - Si es False -> no pasa nada

¿Qué pasa si cambio edad a 15?
"""

################### PASO 2 ###################
edad = 15

if edad >= 18:
    print("Eres mayor de edad")
else:
    print("Eres menor de edad")

"""
-> if = Camino A
-> else = Todos los demas (B,C,D, etc)

IMPORTANTE
Else no tiene condición, es el "si no"

Si tengo hambre, como. Si no, no como.
"""

################### PASO 3 ###################

calificacion = 75

if calificacion >= 90:
    print("Excelente")

elif calificacion >= 70:
    print("Aprobado")

else:
    print("Reprobado")

"""
Python es un lenguaje que lee linea por linea, de arriba a abajo.
En cuanto encuentra una condición verdadera dentro del bloque if/elif/else
deja de evualar las demás

PREGUNTAS
¿Qué pasa si calificacion = 95?
¿Se revisan todas las condiciones? No, se detiene en la primer condicion verdadera
"""

################### PASO 4 ###################

"""
En Python, la indentación no es decoración. Es estructura
"""
# if edad >= 18:
# print("Mayor")

"""
Esto da error, Python necesita el bloque identado (4 espacios)
"""

################### EJERCICION EN CLASE ###################
"""
Pedir un número al usuario y decirle si es:

    - Positivo
    - Negativo
    - Cero
"""

# 1. Entrada de datos
numero = input("Dame un número entero: ")

# 1.1 Corroborar tipo de dato
print(type(numero))

#2. Conversión de datos
numero = int(numero)

# 3. Proceso

if numero > 0:
    print("Es positvo")

elif numero < 0:
    print("Es negativo")

else:
    print("Es cero")
