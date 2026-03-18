/**
 *  Estructura del Programa que ordena con distintos algoritmos un arreglo de
 *  tipos int, obtiene su máximo y mínimo.
 *
 * Curso: Programación
 *
 * Temas: 3.1, a 3.3 \ 4.1 del Temario
 *        Construtctores, metodos de asignación, consulta, calculadores,
 *        misceláneos
 *
 *        Algoritmos de Ordenamientos, Máximo, Mínimo y Promedio.
 *
 *
 *  Dado su diagrama UML
 *
 * Referencias:
 *  - Alsuwaiyel (2022). Algorithms Design Techniques and Analysis. 2nd edition
 *    World Scientific.
 *      + Algorithm 1.4 selectionsort  pag 13
 *      + Algorithm 1.5 insertionsort  pag 14
 *      + Algorithm 1.19 bubblesort pag 70
 *
 * Software:
 *    java 25
 *
 * @author Roberto Méndez Méndez / Deepseek
 * Fecha: 16/ Marzo/ 22
 * Editado: 9 Marzo 2026
 */

public class Estructura_ManejoDatos {
    private int[] data;
    private int size;

    public Estructura_ManejoDatos() {
        this.data = new int[0];
        this.size = 0;
    }

    public Estructura_ManejoDatos(int[] arr) {
        this.data = arr.clone();
        this.size = arr.length;
    }

    public void setData(int[] arr) {
        this.data = arr.clone();
        this.size = arr.length;
    }

    public int[] getData() {
        return data.clone();
    }

    public void bubbleSort() {
        // Implementación de bubble Sort
    }

    public void insertionSort() {
        // Implementación de Insertion Sort
    }

    public void selectionSort() {
        // Implementación de Selection Sort
    }

    public int max() {
        // Encontrar máximo
        return 0;
    }

    public int min() {
        // Encontrar mínimo
        return 0;
    }

    public double average() {
        // Calcular promedio
        return 0.0;
    }

    public void displayArray() {
        // Mostrar arreglo
    }

    public void sortAndDisplay(String method) {
        // Ordenar según método y mostrar
    }
}
