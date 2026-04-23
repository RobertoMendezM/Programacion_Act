import javax.swing.*;
import java.awt.*;

public class Cuadrado_Swing extends JFrame {

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 200);
        // Borrará un rectángulo de 100x100 empezando en
        // la coordenada (100, 100)
        g.clearRect(100, 100, 100, 100);
    }
}

