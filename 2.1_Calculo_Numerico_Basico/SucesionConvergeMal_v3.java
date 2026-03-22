/**
 * Convergencia (incorrecta) de la sucesión
 *
 *       u_0 = 2  u_1 = -4
 *       u_n= 111 - 1130/u_n-1 + 3000/(u_n-1 * u_n-2)
 *
 *   Escrito en la forma:
 *
 *       u_n = g*111L - b*1130L + a*3000L     para  n >= 4
 *
 *    Condiciones inciales de g, b y c
 *
 *       g = 347;
 *       b = 37;
 *       a = 2;
 *
 * Curso: Programación
 *
 * Tema: 2.1 Operaciones y consideraciones numéricas
 *       2.3 Ciclos
 *       Epsilon de Máquina y Métrica de paro
 *
 * Objetivo: Uso de long para pretender calcular correctamente el límite
 *           de la sucesión
 *           long 64 bits (8 bytes), de:
 *  *        -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807..
 *
 * Referencia:
 *  - Muller & Brunie et al (2018). Handbook of Floating-Point
 *    Arithmetic 2nd Edition  pág. 9
 *
 *  @author:  Roberto Méndez Méndez
 *  @since   20 Feb 2026
 *  Editado  22 marzo 2026
 */

public class SucesionConvergeMal_v3 {
    public static void main(String[] args) {
        long g = 347L;
        long b = 37L;
        long a = 2L;
        long tmp = 0L;
        int indice = 30;

        for (int i = 4; i <= indice; i++) {
            tmp = g;
            g = g*111L - b*1130L + a*3000L;
            a = b;
            b = tmp;

            // División incorrecta
            //System.out.printf("Valor en %d es %d %n", i, g/b);

            System.out.println("numerador: "+ g);
            System.out.printf("Valor en %d es %.5f %n",i, (double)g/b);
        }
    }
}
