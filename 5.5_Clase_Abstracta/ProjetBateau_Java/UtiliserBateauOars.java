/**
 * Curso: Programación

 * Clase que crea un objeto de la clase BateauOars
 * y lo pinta

 * Temas: Clase Abtracta
 *        Entorno Gráfico: JFrame

 * Software:
 *      Java 25
 *      IntelliJ 2025.3.1
 *
 * @author Roberto Méndez Méndez
 * Creación 16/ May/ 22
 * Edición  21 Mayo 2026
 */
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;

void main() {
    JFrame avirons = new
            BateauOars(40, 200, 400, Color.CYAN, 1);
    avirons.setSize(500,500);
    avirons.setTitle("Mon Avirons");
    avirons.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // Posición del Frame avirons.setLocation(20,20);
    avirons.setLocationRelativeTo(null);

    avirons.setVisible(true);
}