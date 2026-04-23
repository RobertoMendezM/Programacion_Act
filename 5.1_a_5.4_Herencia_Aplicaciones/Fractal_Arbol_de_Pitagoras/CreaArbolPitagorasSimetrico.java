/**
 * Curso: Programación
 *
 * Crea un Frame y utiliza la clase "ArbolDePitagorasSimetrico"
 * para dibujar el fractal Árbol de Pitagoras Simétrico
 *
 * Objetivos: Tema 5.Herencia y manejo de swing.JFrame elemental
 *
 * Referencia:
 *      Buch: Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and
 *      Datenstrukturen Eine Einführung mit Java Buchseite: 180 (lector)
 *
 * Software: Java 25
 *
 * Editor: Roberto Méndez Méndez
 * @version 7 Abril 22
 * editado: 23 Abril 26
 */

import javax.swing.*;

void main() {
    JFrame frame = new ArbolDePitagorasSimetrico();

    //Tamaño y título del Frame
    frame.setSize(500, 500);
    frame.setTitle("Fractal. Árbol de Pitágoras");

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // Posición del Frame
    frame.setLocationRelativeTo(null);

    frame.setVisible(true);
}
