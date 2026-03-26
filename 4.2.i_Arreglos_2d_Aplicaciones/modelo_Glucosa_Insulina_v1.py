# -*- coding: utf-8 -*-
"""
IMPLEMENTACIÓN DEL MODELO PARA Glucosa Insulina

Objetivo: Ejercicio 1.6. Programa el modelo Glucosa-Insulina
          ahí propuesto. mostrando dos graficas:
              
          1ra.- tiempo-Glucosa tiempo-Insulina
          2da.- Plano fase, con gráficas de steady-state y
                curva integral glucosa-insulina

Referencias:
 - Alon (2024). Systems Medicine. Physiological Circuits and the 
   Dynamics of Disease. pág. 22


Modelo a Programar:
 
  dG/dt = m − sIG
  dI/dt = qBf(G) - gI

   f(G) = G^2/(K^2 - G^2)
   

Valores

G(t): cantidad de glucoas 
I(t): cantidad de insulina
m: Blood glucose concentration, G(t), produced by meals and by liver
   production of glucose.
s: insuline sensitivity
q: maximal production rate per unit biomass of beta cells divided by 
   the blood volume
B: total beta cell mass
f(G): increasing function of glucose G. f(G) take values between 0 and 1. 
g: insuline removal rate


Software: 
     Python 3.14.3
     IDE Spyder 6.1.3

@author:: ROBERTO MÉNDEZ MÉNDEZ
Creación: 6 Mar 2026 
Edición:  8 Mar 2026
@version: 3ra
"""

import numpy as np
import matplotlib.pyplot as plt

# PARÁMETROS
q = 1
B = 1
s = 1
g = 1
m = 0.5

#   ARREGLOS DE VALORES

# valores de tiempo
n=200
time = np.linspace(0, 20, n)

# valores de glucosa
gl_fin = 2
gl = np.linspace(0, gl_fin, n)

# Matriz  Glucosa - Insulina
GI = np.zeros((2,time.size))

# CONDICIONES INICIALES DE GLUCOSA E INSULINA
GI[0][0] = 1
GI[1][0] = 0


# MÉTODO DE EULER HACIA ADELANTE
for i in range(len(time)-1):
    
    fG = GI[0][i]**2/(1 + GI[0][i]**2)
    
    GI[0][i+1] = GI[0][i]  + (m - s*GI[1][i]*GI[0][i])*time[1];
    GI[1][i+1] = ( GI[1][i]  +  
                 (q*B*fG  - g*GI[1][i])*time[1] )

# STEADY-STEATE EQUATION GLUCOSE AND INSULINE
k = int(.4*n/gl_fin)
Istg = m/(s*gl[k:])
Isti = q*B*gl**2/(g*(1 + gl**2))

####################
#      GRÁFICAS
####################

# Graficas tiempo-Glúcosa y tiempo.Insulina
plt.plot(time, GI[0],  label='Glucosa' )
plt.plot(time, GI[1],  label='Insulina')
plt.title('Cambio Glucosa e Insulina en el tiempo')
plt.ylabel('Insulina / Glucosa')
plt.xlabel('t tiempo')
plt.legend(loc='lower right') 
plt.show()

# Plano fase. Grafica Steady-state y curva integral 
plt.plot(GI[0],GI[1],linestyle=':', label='curva integral')
plt.plot(gl, Isti,label=r'$I_{st}=\frac{G_{st}^2}{1 + G_{st}^2}$')
plt.plot(gl[k:], Istg, label=r'$I_{st}=\frac{0.5}{G_{st}}$')
plt.title('Plano Fase Glucosa-Insulina')
plt.ylabel('I insulin')
plt.xlabel('G glucose')
plt.legend(loc='upper right') 
plt.show()

plt.close('all') 