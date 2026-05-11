/**
 * Curso: Programación
 *
 * Uso: Utiliza la clase que ya implementa Interface Multiples
 *      y muestra su aplicación en un entorno gráfico y de consola
 *
 * Temas: interfaces / Javax.Swing.JOptionPane con HTML
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
import elementos.InterfacesMultiples;
import javax.swing.*;

void main() {
    InterfacesMultiples itm = new InterfacesMultiples();

    itm.debesImplementar("Soy abstracto, Ya que");

    itm.soyDefault();

    itm.usaPrivado();

    String message = "<html><font size='5'>" +
            "Do you want be my friend: " + "</font></html>";
    String friendly =  JOptionPane.showInputDialog(null,
            message,"Oui ou Non");
    String answer = friendly.equals("Oui") ? itm.beMyFriend(true) :
            itm.beMyFriend(false);
    answer = "<html><font size='5'>" +
              answer +"</font></html>";
    JOptionPane.showMessageDialog(null, answer);
}