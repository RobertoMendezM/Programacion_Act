/**
 * Programa que despliega un "Explorador de archivos" (Finder)
 * para buscar y seleccionar un archivo
 *
 * Curso: Programación  2026-2
 *
 * Referencias:
 * - https://docs.oracle.com/en/java/javase/25/docs/api/java.desktop/javax/swing/UIManager.html
 *
 * @author Roberto Méndez Méndez
 * Creación:  19 May 2026
 */
package selectordearchivo;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.File;

public class SelectorGraficoDeArchivo2 {

    public static File seleccionaArchivo2() {
        File archivo = null;

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        JFileChooser archivoSel = new JFileChooser();
        int valor = archivoSel.showOpenDialog(archivoSel.getParent());
        if (valor == JFileChooser.APPROVE_OPTION) {
            try {
                File tmpArch = archivoSel.getSelectedFile();
                String ruta = tmpArch.getAbsolutePath();
                archivo = new File(ruta);
            } catch (SecurityException f) {
                System.err.println("No se pudo accesar el archivo");
            }
        } else {
            System.out.println("Al parecer no seleccionaste ningún archivo ");
        }
        return archivo;
    }

}

