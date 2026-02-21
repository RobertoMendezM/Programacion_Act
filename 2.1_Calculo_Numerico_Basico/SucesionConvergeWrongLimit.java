/**
 * Convergencia incorrecta de una Sucesión 
 *
 * Curso: Programación
 *
 * Tema: 2.1 Operaciones y consideraciones numéricas
 *       2.2 Clase y Métodos
 *
 * Objetivo: Evidenciar como afecta la representación de punto
 *           flotante el cálculo numérico al calcular la
 *           convergencia de una sucesión habiendo programado
 *           de manera directa la expresión matemática
 *
 * Referencia:
 *  Muller & Brunie et al (2018). Handbook of Floating-Point
 *  Arithmetic 2nd Edition  pág. 9
 *
 *  Editor:  Roberto Méndez Méndez
 *  @since  19 Feb 2026
 *  @version 1
 */


public class SucesionConvergeWrongLimit {

    public static void main(String[] args) {
        double u0 = 2;
        double u1 = -4;
        double u_n = 0;
        for(int i = 3; i <30; i++ ){
            u_n = 111 - 1130/u1 + 3000/(u0*u1);
            u0 = u1;
            u1 = u_n;
            System.out.printf("Valor en %d es %.5f %n",i,u1);
        }
    }

}
