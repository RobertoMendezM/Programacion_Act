/**
 *  Programa que implementa instancias de la clase
 *                Estructura_ManejoDatos
 *  para probar los diversos métodos.
 *
 * Curso: Programación
 *
 * Temas: 3.1 y 4.1 del Temario
 *
 * Software:
 *    java 25
 *    IntelliJ IDEA 2025.3.4
 *
 * @author Roberto Méndez Méndez
 * Fecha: 20 marzo 2026
 */

void main() {
    Estructura_ManejoDatos e = new Estructura_ManejoDatos();
    int[] a = {4,3,12,5};

    e.setData(a);
    System.out.println("Arreglo: " +
                          Arrays.toString(e.getData()));
    e.bubbleSort();
    System.out.println("Ordenado con Bubblesort: " +
                          Arrays.toString(e.getData()));
}