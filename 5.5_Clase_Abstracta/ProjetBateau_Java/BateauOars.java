/**
 * Curso: Programación
 *
 * Adaptación de:
 * Buch: McAllister & Fritz (2021).Programming Fundamentals Using Java
 *       A Game Application Approach, 2nd edition, Ed. Mercury Learning and Information
 * Buchseite: pag. 380
 *
 * Temas: Extensión de Clase Abstracta
 *        Herencia
 *        Graficación. Javax.swing
 *
 * Software:
 *      Java 25
 *      IntelliJ 2025.3.1
 *
 * Editor Roberto Méndez Méndez
 * @version 16/ May/ 22
 * Modificado  18/May/ 22
 */

import java.awt.*;

public class BateauOars extends  Bateau{

    private int oars;

    public BateauOars(int x, int y, int length, Color c, int oars){
        super(x, y, length, c);
        this.oars = oars;
    }

    @Override
    public int calculatePrice()
    {
        int hullPrice = super.calculatePrice();
        return hullPrice + oars * 10;
    }

    @Override
    public void show(Graphics g)
    {
        super.show(g);
        g.setColor(Color.BLACK);
        for (int i = 1; i <= oars; i++) {
            g.fillRect(getX() + i * 10, getY() - 20, 2, 20); //handle
            g.fillOval(getX() + i * 10 - 2, getY() - 30, 6, 10); //paddle
        }
    }
    public String toString(){
        return super.toString() + ", Oars: " + oars;
    }
}
