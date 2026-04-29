# -*- coding: utf-8 -*-
"""
 (INTERFAZ) ABC 

Curso: Programación

Tema: (Iterfaces) Abstract Base Classes en Python 


Autor:     Deepseek
Editor:    Roberto Méndez Méndez
Creación:  26 Abril 2026 
"""

from abc import ABC, abstractmethod

# Definición de la interfaz
class Animal(ABC):
    
    @abstractmethod
    def hacer_sonido(self):
        """Método obligatorio para todas las subclases"""
        pass
    
    @abstractmethod
    def moverse(self):
        """Método obligatorio para todas las subclases"""
        pass

# Implementaciones concretas
class Perro(Animal):
    def hacer_sonido(self):
        return "¡Guau guau!"
    
    def moverse(self):
        return "Corriendo en 4 patas"

class Gato(Animal):
    def hacer_sonido(self):
        return "¡Miau!"
    
    def moverse(self):
        return "Caminando sigilosamente"

class Pajaro(Animal):
    def hacer_sonido(self):
        return "¡Pío pío!"
    
    def moverse(self):
        return "Volando"



# Uso
def interactuar_con_animal(animal: Animal):
    print(f"Sonido: {animal.hacer_sonido()}")
    print(f"Movimiento: {animal.moverse()}")

# Crear instancias
perro = Perro()
gato = Gato()
pajaro = Pajaro()

interactuar_con_animal(perro)
interactuar_con_animal(gato)
interactuar_con_animal(pajaro)    
