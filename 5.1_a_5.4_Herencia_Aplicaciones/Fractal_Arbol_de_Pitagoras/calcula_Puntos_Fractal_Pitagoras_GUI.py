# -*- coding: utf-8 -*-
"""
De apoyo para verificar el cálculo de los puntos del Fractal
de Pitágoras


Autor: Deepseek
Editor: Roberto Méndez
Creado  2o Abril  2026
"""

import tkinter as tk
from tkinter import messagebox
from tkinter import font

def obtener_datos():
    try:
      x1 = float(entry_x1.get())
      y1 = float(entry_y1.get())
      x2 = float(entry_x2.get())
      y2 = float(entry_y2.get())
    
      if x1 and y1 and x2 and y2:
        dx = x1 - x2;
        dy = y1 - y2;
        x3 = x1 - dy;
        y3 = y1 + dx;
        x4 = x2 - dy;
        y4 = y2 + dx;
        messagebox.showwarning( "Forma chafa de mostrar datos", 
                            f"x3 =  {x3},  y3 = {y3}, x4 = { x4}, y4= { y4}")
    
    except ValueError:
        messagebox.showwarning("Campos vacíos", "Por favor complételos")

# Crear ventana
ventana = tk.Tk()
ventana.title("Ingreso de Puntos Base del Fractal")
ventana.geometry("300x300")
myEstilo= mi_fuente = font.Font(family="Comic Sans MS", size=13, weight="bold")

# Etiquetas y campos de entrada
tk.Label(ventana,  font=myEstilo, text="x1:").pack(pady=1)
entry_x1 = tk.Entry(ventana)
entry_x1.pack(pady=1)

tk.Label(ventana, font=myEstilo, text="y1:").pack(pady=1)
entry_y1 = tk.Entry(ventana)
entry_y1.pack(pady=1)

tk.Label(ventana,font=myEstilo, text="x2:").pack(pady=1)
entry_x2 = tk.Entry(ventana)
entry_x2.pack(pady=1)

tk.Label(ventana, font=myEstilo, text="y2:").pack(pady=1)
entry_y2 = tk.Entry(ventana)
entry_y2.pack(pady=1)


# Botón
tk.Button(ventana, font=('Helvetica', '13', "bold"), text="Enviar", 
          command=obtener_datos).pack(pady=20)

ventana.mainloop()