/**
 * Ejemplos de:
 *          Definición,
 *          Acceso a y asignación de. valores en arreglos,
 *          Ciclos para recorrer el arreglo.
 *
 * Curso: Programación
 *
 * Tema: 4.1 Temario
 *       Arreglos estáticos unidimensionales
 *
 * Software:
 *      Java 25
 *      IDE ItelliJ 2025.3.3
 *
 * @author: Roberto Méndez
 * Creación: 14 Marzo de 2022
 * Edición:  9 Marzo 2026
 */

import java.util.Scanner;

public class Def_Acceso_Asigna_Arreglos1D {

    public static void main(String[] algo){

        Scanner datos = new Scanner(System.in);

        /**
         * FORMAS BÁSICAS DE DECLARAR UN ARREGLO
         */

        // Arreglo tipo double de 4 lugares
        double[] comorbilidades = new double[4];

        // Declaración explícita arreglo entero
        int[] defunciones = {110000, 123000, 213000};


        /**
         * ASIGNACIÓN DE Y ACCESO A, UN DATO DENTRO
         * DE UN ARREGLO.
         */

        // asignación de valor en una posición específica
        System.out.println("ingresa una comorbilidad ");
        comorbilidades[3] = datos.nextDouble();

        // Recuperación de un
        double d = comorbilidades[2];


        /**
         *  CICLOS PARA RECORRER EL ARREGLO
         */

        /**
         *  Ciclo FOREACH
         *  Recorre el areglo tomando cava valor dentro de él
         */
        for (int k:defunciones) {
            System.out.println(k);
        }

        /**
         *  Ciclo WHILE
         *  Los arreglos en java se indexan desde 0
         *  k va de 0 a 2
         */
        int k=0;
        while( k < defunciones.length){
            System.out.println(defunciones[k]);
            k++;
        }

        /**
         *  Ciclo FOR
         *  Los arreglos en java se indexan desde 0
         *  k va de 0 a 2
         */
        for(int i=0; i< comorbilidades.length; i++){
            System.out.print("¿la comorbilidad " + i + " es?: ");
            comorbilidades[i] = datos.nextDouble();
        }

    }
}
