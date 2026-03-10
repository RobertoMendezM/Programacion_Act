/**
 *  Programa que ordena un arreglo de enteros y obtiene
 *  su máximo.
 * 
 * Curso: Programación
 *
 * Temas: 4.1 del Temario
 *        Uso de Arrays, IntStream y OptionalInt
 *        para ordenar el arreglo y obtener el máximo.
 *
 *        Uso de
 *              import static java.lang.System.*;
 *        para omitir el uso de la palabra reservada
 *        System
 *
 * Referencias:
 *    https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Arrays.html
 *
 * Software:
 *    java 25
 *
 * @author Roberto Méndez Méndez
 * Fecha: 16/ Marzo/ 22
 * Editado: 9 Marzo 2026
 */

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import static java.lang.System.*;

public class UsandoArrays {

    /**
     * Obtiene el máximo valor en un arreglo de tipos int.
     * haciendo uso de las clases Arrays, IntStream y OptionalInt
     * @param datos
     * @return el máximo valor en el arroglo
     */
    public static int maximo(int[] datos){
        int max = 0;
        IntStream myIntSetram = Arrays.stream(datos);
        OptionalInt seraEntero = myIntSetram.max();
        try {
            max = seraEntero.getAsInt();
        }
        catch (NoSuchElementException e){
            err.println("El valor no es del tipo  int");
        }
        return max;
    }

    public static void main(String[] algo){

        int[] profit = {155538, 218885, 150303};

        // Ordena el arreglo 
        Arrays.sort(profit);
        
        out.println("El arreglo ordenado es: ");
        for (int k:profit) {
            out.print(k + ", ");
        }

        // llama al método maximo
        int max = UsandoArrays.maximo(profit);
        out.println("\n El máximo valor del arreglo fue: " + max);

    }


}
