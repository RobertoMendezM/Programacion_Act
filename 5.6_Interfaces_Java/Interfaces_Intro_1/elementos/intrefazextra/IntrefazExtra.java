/**
 * Curso: Programación
 *
 * Uso: De apoyo "Herencia" múñtiple e
 *      implementación múñtiple
 *
 * Temas: interface Elementos Básicos
 *
 * Extendida por:
 *      HeredoInterfaces
 *
 * Software:
 *      Java 8 y 25
 *
 * @author Roberto Méndez Méndez
 * Creación 20/ May/ 22
 * Edición  10 Mayo 2026
 */

package elementos.intrefazextra;

public interface IntrefazExtra {

    String beMyFriend(boolean loveMe);

    default char[] tuAsSommeil(String sommeil){
        char[] sleep = sommeil.toCharArray();
        return sleep;
    }

}
