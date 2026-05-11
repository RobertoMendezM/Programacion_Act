/**
 * Curso: Programación
 *
 * Temas: Herencia múltiple de interfaces por otra iterfaz
 *
 * Software:
 *      Java 8 y 25
 *
 * @author Roberto Méndez Méndez
 * Creación 20/ May/ 22
 * Edición  10 Mayo 2026
 */
package elementos.extendinterfaz;

import elementos.interfaz.ElementosBase1;
import elementos.intrefazextra.IntrefazExtra;

public interface HeredoInterfaces extends ElementosBase1, IntrefazExtra {

    default void usoOtrasInterfaces(){
        soyDefault();
        System.out.println("pero también");
        System.out.println(tuAsSommeil("j'ai sommeil"));
    }
}
