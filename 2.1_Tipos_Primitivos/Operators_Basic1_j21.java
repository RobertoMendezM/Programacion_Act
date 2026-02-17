
/**
 * Programa para ejemplificar
 * los distintos operadores en JAVA
 *
 * Curso: Programación
 * Tema: 2.1 Operadores y Especificadores de Formato
 *
 * Objetivo: Mostrar el uso de distintos operadores
 *            y especificadores de formato.
 *
 * Aviso: Es el mismo que
 *               Operadores_Especificadores_Basicos1_j25.java
 *        pero esta modificado para ejecutarse con java 21.
 *
 * Referencias:
 *  Javadocs
 * -https://docs.oracle.com/en/java/javase/25/docs/api//java.base/java/lang/Float.html
 * -https://download.java.net/java/early_access/loom/docs/api/java.base/java/lang/Math.html
 *  Unicode valores:
 * -https://www.w3schools.com/charsets/ref_utf_symbols.asp
 *
 * Software: Java 21 / Java 25
 *           IDE IntelliJ 2025.3.1
 *
 * Compilador Online:
 *  https://dev.java/playground/
 *  -- Selecciona: Detailed output
 *
 * @author  Roberto Méndez Méndez
 * Creado:  16-Feb-2026
 */

import java.util.Scanner;

public class Operators_Basic1_j21
{
    public static void main(String[] args)
    {
        Scanner dato = new Scanner(System.in);
        float saldo_Final ;

        System.out.println("Formato de apuestas \n " +
                "¡¡ " +
                "Puedes Ganar hasta 100 veces más \u2623 !!");
        System.out.print("Ingresa tu apuesta: ");
        float apuesta =
                Float.parseFloat(
                        dato.nextLine());
        short valorCalculado = (short)(Math.random()*200 - 100);
        byte operacion = (byte) (Math.random()*7%7);

        switch (operacion) {
            case 0: // para suma
                saldo_Final = apuesta + valorCalculado;
                System.out.println("Saldo: " + saldo_Final);
                break;
            case 1: // resta
                apuesta -= valorCalculado;
                System.out.printf("Saldo: %.2f ", apuesta);
                break;
            case 2: // multiplicación - división
                if(valorCalculado < 0){
                    System.out.println("Perdise \u2639. Te queda: "+
                            -1*apuesta / valorCalculado);
                }else {
                    System.out.println("Ganaste \u263A %s".
                            formatted(apuesta * valorCalculado));
                }
                break;
            case 3: // ++
                System.out.println("Algo es algo: " + ++apuesta);
                break;
            case 4: // --
                System.out.println("Perdiste poco: " + --apuesta);
                break;
            case 5: // modulo
                apuesta %= 5;
                System.out.printf("Ya ni modo, 'ganaste' : %.2f",
                        apuesta );
                break;
            default:
                System.out.println("No tengo registrada la operación");
        }
    }
}
