/**
 * Programa que despliega un "Explorador de archivos" (Finder)
 * para buscar y seleccionar un archivo
 *
 * Curso: Programación 2026-2
 *
 * @author Roberto Méndez Méndez
 * Creación:  16-Nov-21
 * Edición:   19 May 2026
 */
package selectordearchivo;

import javax.swing.JFileChooser;
import java.io.File;

public class SelectorGraficoDeArchivo1 {

    public static File seleccionaArchivo1() {
        File archivo = null;

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
