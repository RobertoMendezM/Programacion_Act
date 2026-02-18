/**
 * Números de punto flotante, representación y comparación
 *
 * Curso: Programación
 *
 * Tema: 2.1 Operaciones y consideraciones numéricas
 *       2.2 Clase y Métodos
 *
 * Objetivo: Evidenciar como afecta la representación de punto
 *           flotante el cálculo numérico en una operación muy
 *           básica
 *
 * Referencia:
 *  Liang, Introduction to Java Programming and Data Structures
 *          pág. 87
 *
 *  @author  Roberto Méndez Méndez
 *  @since  23/Mar/22
 *          11 Nov 2025
 *          18 Feb 2026
 *  @version 3
 */

public class ErrorComparandoFPN {

    final double EPSILON = 1E-15;

    /**
     *  Este método teóricamente debería imprimir true,
     *  pero por la forma de operar y representar los números
     *  de punto flotante, el resultado es "false"
     */
    public static void formaIncorrecta(){
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(x == 0.5);
    }

    public void formaCorrecta(){
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if(Math.abs(x - 0.5) < EPSILON) {
            System.out.println(x + " " +
                    "es aproximadamente 0.5");
        }
    }

    public static void main(String[] args){
        ErrorComparandoFPN.formaIncorrecta();
        ErrorComparandoFPN fc = new ErrorComparandoFPN();
        fc.formaCorrecta();
    }
}
