import javax.swing.*;

void main() {
    JFrame frame = new Cuadrado_Swing();
    //Tamaño del Frame
    frame.setSize(500, 500);
    frame.setTitle("Contorno Cuadrado");

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // Posición inicial del Frame
    // frame.setLocation(10, 10);
    frame.setLocationRelativeTo(null);

    frame.setVisible(true);
}