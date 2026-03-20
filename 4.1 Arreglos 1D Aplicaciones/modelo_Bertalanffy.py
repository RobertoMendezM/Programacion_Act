# -*- coding: utf-8 -*-
"""
IMPLEMENTACIÓN DEL MODELO BERTALANFFY PARA CANCER

Growth-Limited Models

Objetivo: Modelar el creciomiento del volumen de la masa del tumor

Referencias:
 - Chaplain & Preziosi (2025). Mathematical Oncology, Springer. 
   pag 38, 40 y 42

Modelo a Programar:
 
  DV/Dt = g*V^(2/3) - d*V

Valores:
    d    tasa de perdida de volumen
    g    tasa de proliferación celular
    V(t) Volumne al tiempo t


Software: 
     Python 3.14.3
     IDE Spyder 6.1.3

@author:: ROBERTO MÉNDEZ MÉNDEZ
Creación: 18 marzo 2026 
Editado:  19 marzo 2026
"""

import numpy as np
import matplotlib.pyplot as plt

# PARÁMETROS
g = 1
d = 1
K = (g/d)**3
#   ARREGLOS DE VALORES

# valores de tiempo
n = 10000
time = np.linspace(0, 10, n)


# Matriz  Glucosa - Insulina
V = np.zeros(time.size)

# CONDICIONES INICIALES DE GLUCOSA E INSULINA
V[0] =0.1


# MÉTODO DE EULER HACIA ADELANTE
for i in range(len(time)-1):
   
    V[i+1] = V[i]  + (g*V[i]**(2/3) - d*V[i])*time[1];


####################
#      GRÁFICAS
####################

# Graficas tiempo-Glúcosa y tiempo.Insulina
leyenda = f'$\gamma$ = {g}, $\delta$ = {d}, K={K}'
plt.plot(time, V, label=leyenda )
plt.title('Crecimiento/Decrecimiento del Tumor en el tiempo')
plt.ylabel('Volumen V(t)')
plt.xlabel('tiempo t')
plt.legend(loc='center right') 
plt.show()


plt.close('all') 