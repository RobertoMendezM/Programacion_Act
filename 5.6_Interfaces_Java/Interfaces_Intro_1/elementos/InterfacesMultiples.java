/**
 * Curso: Programación
 *
 * Temas: Implementar varias Interfaces
 *
 * Software:
 *      Java 8 y 25
 *
 * @author Roberto Méndez Méndez
 * Creación 20/ May/ 22
 * Edición  10 Mayo 2026
 */
package elementos;

import elementos.interfaz.ElementosBase1;
import elementos.intrefazextra.IntrefazExtra;

public class InterfacesMultiples implements ElementosBase1,
        IntrefazExtra {

    @Override // de ElementosBase1
    public void debesImplementar(String pasameAlgo) {
        System.out.println("c'est toi qui as écrit: " + pasameAlgo);
    }

    @Override  // de IntefazExtra
    public String beMyFriend(boolean loveMe) {
        if (loveMe)
            return "Yes I'm your best fried";
        return "Je te déteste";
    }
}
