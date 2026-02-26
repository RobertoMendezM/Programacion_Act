/**
 * Convergencia de una Sucesión
 *       u_0 = 2  u_1 = -4
 *       u_n= 111 - 1130/u_n-1 + 3000/(u_n-1 * u_n-2)
 *
 *  Curso: Programación
 *
 * Tema: 2.1 Operaciones y consideraciones numéricas
 *       2.3 Ciclos
 *       Epsilon de Máquina y Métrica de paro
 *
 * Objetivo: Uso de BigInteger para calcular correctamente el límite
 *           de la sucesión y estabelcer un criterio (métrica) de
 *           paro del  programa (sucesión de cauchy).
 *
 * Referencia:
 *  Muller & Brunie et al (2018). Handbook of Floating-Point
 *  Arithmetic 2nd Edition  pág. 9
 *
 *  Editor:  Roberto Méndez Méndez
 *  @since   26 Feb 2026
 *  @version 1
 */

import java.math.BigInteger;

public class SucesionConvergeWrongLimit4 {

    public static void main (String[] args) {
        final double EPSILON = 1E-15;
        BigInteger g = new BigInteger("347");
        BigInteger b = new BigInteger("37");
        BigInteger a = new BigInteger("2");
        BigInteger k1 = BigInteger.valueOf(111);
        BigInteger k2 = BigInteger.valueOf(1130);
        BigInteger k3 = BigInteger.valueOf(3000);
        double u_act = 0, u_ant = 0;

        BigInteger tmp ;
        int indice = 180;

        for (int i = 4; i <= indice; i++) {
            tmp = g;
            g = g.multiply(k1).subtract(b.multiply(k2)).
                    add(a.multiply(k3));
            a = b;
            b = tmp;

            // Forma Incorrecta similar a dividir dos enteros
            /*
            System.out.printf("Valor en %d es %.20f %n",
                   i,g.divide(b).doubleValue() );
            */

            u_act = g.doubleValue()/b.doubleValue();
            System.out.printf("Valor en %d es %.20f %n",
                    i, u_act);

            // Criterio de paro del programa
            if(Math.abs(u_ant - u_act) <= EPSILON ){
                System.out.println("La sucesión converge a: " +
                        Math.floor(u_act));
                break;
            }
            u_ant = u_act;
        }
    }
}
