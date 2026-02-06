/*
Programa que debe recibir un entero como entrada

Curso: Programación 2026-2  FC UNAM

Usos:
- Para que el alumno pruebe su compilador
- para ver un ejemplo elemental de entrada de consola
- para compararlo con otras formas de pedir datos
- para ver que tipo de error envia cuando se espera un entero
  y se ingresa otro valor

Software
    Java 25
    IDE IntelliJ 2025.3.1

@author  Roberto Méndez
Edición: 5 Feb 2026
 */

import java.util.Scanner;

public class LeeEntero1 {

    public static void main(String[] algo){

        Scanner al = new Scanner(System.in);
        System.out.println("Da un entero: ");
        int toma = al.nextInt();
        System.out.println("Diste el valor:" + toma);
    }
}
