"""
===========================================================
Autor: Enrique de Jesús Soriano Mejía
Materia: Programación
Grupo: 9157
Tema: Primeros pasos en Python (Input/Output)
Fecha: 2026-02-10
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
1) Entender cómo Python muestra la información (output) con print()
2) Entender cómo Python recibe información (input) con input()
3) Praticar variables, tipos de dato básico y conversion a int/float
4) Hacer mini programas interactivos sencillos
"""

# # ---------------------------------------------------------
# # 0) Bienvenida (OUTPUT)
# # ---------------------------------------------------------
print("=" * 55)
print("Bienvenid@ a Python: Input / Output (I/O)")
print("=" * 55)
print("Hoy vamos a practicar cómo hablar con la computadora:")
print(" - print()  -> la compu muestra información")
print(" - input()  -> la compu recibe información")
print()

# # ---------------------------------------------------------
# # 1) Hola Mundo
# # ---------------------------------------------------------
print("Ejercicio 1 - Hola Mundo")
print("Hola Mundo!")

# # ---------------------------------------------------------
# # 2) Primer input: Pedir tu nombre
# # ---------------------------------------------------------
print("2) Input básico (texto)")

# Creamos una varianle y le asignamos un valor, el cual sera determinado por el usuarip
nombre = input("¿Cómo te llamas? ")
print("Hola, ", nombre)
print()

# # ---------------------------------------------------------
# # 3) Input + conversión de tipo (int)
# #    OJO: input() siempre regresa texto, por eso usamos int()
# # ---------------------------------------------------------
print("3) Input numérico (conversión a int)")
edad = int(input("¿Cuántos años tienes? "))
print("El próximo año tendrás", edad + 1)
print()

# ---------------------------------------------------------
# 4) Mini reto: calculadora de propina
#    Aquí usamos float porque pueden ser números con decimales.
# ---------------------------------------------------------
print("4) Mini reto: calculadora de propina")
total = float(input("Total de la cuenta ($): "))
porcentaje = float(input("Porcentaje de propina (ej. 10, 15, 20): "))

propina = total * (porcentaje / 100)
total_con_propina = total + propina

print("\n--- Resultados ---")
print(f"Propina: ${propina:.2f}")
print(f"Total con propina: ${total_con_propina:.2f}")
print()
