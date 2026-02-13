"""
===========================================================
Autor: Enrique de Jesús Soriano Mejía
Materia: Programación
Grupo: 9157
Tema: Organización general de un Programa
      Entrada -> Proceso -> Salida
Fecha: 2026-02-12
===========================================================

Modelo simplificado de Seguro de Vida Temporal
"""

# INPUT/ENTRADA DE DATOS
asegurado = input("Nombre del asegurado: ")
edad = int(input("Edad: "))
duracion = int(input("Duración del seguro (años): "))
suma_asegurada = float(input("Suma asegurada: $"))
tasa_interes = float(input("Tasa de interés (decimal, ej. 0.08): "))

proba_dead = float(input("Probabilidad de muerte (ej. 0.005): "))
years_trans = int(input("Años transcurridos: "))

bene_porcentaje = float(input("Procentaje del beneficiario (%): "))


# PORCESO

# 1. ¿Cuánto podría costarme el riesgo?

# 2. ¿Cuánto debo cobrar?

# 3. ¿Cuánto dinero tengo acumulado?

# 4. ¿Cuánto recibe el beneficiario?

# 1. Calcular la probabilidad de supervivencia
# Este calculo lo hacemos porque solo hay dos opciones, vivir o morir
prob_super = 1 - proba_dead

# 2. Calcular la Prima Neta Nivelada
# Calculo realizado porque la aseguradora necesita cobrar lo suficiente para cubrir el riesgo
# Numerador es cuanto podria costar a la aseguradora 
# Denominador El dinero crece con interes, no siempre va a morir la persona

#Idea principal: Ajustar el costo del riesgo considerando que el dinero tambien genera rendimiento
prima_neta = (suma_asegurada * proba_dead) / (1 + tasa_interes - prob_super)

# 3. Calculamos la reserva
# Dinero acumulado despues de varios años
reserva = prima_neta * years_trans * ((1 + tasa_interes) ** years_trans) * (1 - proba_dead)

# 4. Calcular el beneficio del beneficiario
beneficio = suma_asegurada * (bene_porcentaje/100)


# SALIDA

print("\n=== RESULTADOS ===")
print("Asegurado:", asegurado)
print("Prima Neta:", prima_neta)
print("Reserva:", reserva)
print("Beneficio del beneficiario:", beneficio)
