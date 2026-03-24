/**
 *  Definición, acceso y asignación de valores en arreglos bidimencionales,
 *  así como ciclos para recorrerlos.
 *
 * Curso: Programación
 *
 * Tema: 4.2 Arreglos Bidimensionales
 *
 * Referencias:
 *   - Charatan (2019). Java in Two Semesters, 4th edition, Springer.
 *     cap 6.9 y 6.10
 *   - DeepSeek
 *
 *  Software:
 *       Java 25
 *       IDE ItelliJ 2025.3.4
 *
 * Creación: 7/ Dic/ 21
 * Edición:  20 marzo 2026
 */

public class Def_Acceso_Asigna_Arreglos2D {

    public static void main(String [] dat){


        /**
         * Declaración de un arrreglo bidimencional
         */
        double [][] lugares = new double [15][3];

        int[][]  predefinido = {
                                { 38, 2, -5, 9},
                                {-6, 55, 8, 51}
                               };

        // Ragged Array
        char[][] curso = {
                {'C', 'U', 'R','S','0'}, // 5 columnas
                {'D','E'},               // 2 columnas
             {'P','R','O','G','R','A','M','A','C','I','O','N'} // 12 columns
                        };

        /**
         * ASIGNACIÓN DE VALORES Y ACCESO A DATOS, DENTRO
         * DE UN ARREGLO BIDIMENCIONAL.
         */


        lugares[0][1] = 4.7;
        lugares[12][0] = -12;

        System.out.printf("Dato en la matriz" +
                "curso[%d][%d] es %f", 0, 1, lugares[0][1],
                "%n");


        /**
         *  CICLOS PARA RECORRER EL ARREGLO
         */
        System.out.println( "%n Datos en la matriz curso" );
        for (int renglon = 0; renglon < curso.length;
             renglon++)
        {
            for (int columna = 0;
                 columna < curso[renglon].length ; columna++)
            {
                System.out.print( " "+
                        curso[renglon][columna]);
            }
            System.out.println();
        }


        System.out.println("%n Con For-each:");
        for (char[] fila : curso) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }

}
