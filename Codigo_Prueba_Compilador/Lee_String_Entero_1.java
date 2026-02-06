/**
 * Programa que usa InputStreamReader y BufferedReader
 * para leer datos
 *
 * Clase: Mataditos 1 / Programación 2026-2  FC UNAM
 *
 * Usos:
 * - Para que el alumno pruebe su compilador
 * - para ver un ejemplo elemental de entrada de consola
 * - para compararlo con otras formas de pedir datos
 * - para ver que tipo de error que envia cuando los datos dados no
 *   son correctos.
 * - Manejo de Excepciones
 * - Cast
 *
 * Software
 *     Java 25
 *     IDE IntelliJ 2025.3.1
 *
 * @author Roberto Méndez
 * created  24/Sep/22
 * edited   5 Feb 2026
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Lee_String_Entero_1 {

    public static void main(String... algo){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(isr);
        String libro = "";
        double precio = 0.0;

        try{
            System.out.println("What was the last book that you read: ");
            libro = teclado.readLine();
            System.out.println("How much do you pay for it: ");
            precio = Double.parseDouble(teclado.readLine());
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("You read " + libro + " and  it cost you " + precio);

    }

}


