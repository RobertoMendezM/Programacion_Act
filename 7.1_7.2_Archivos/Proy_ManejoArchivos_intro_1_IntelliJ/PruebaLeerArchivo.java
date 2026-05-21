/**
 * Programa que Lee los datos de un archivo de texto o csv
 *
 * Curso: Programación  2026-2
 *
 * Referencias:
 * - https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Scanner.html
 *
 * @author Roberto Méndez Méndez
 * Creación:  Nov 2021
 * Edición:   20 May 2026
 */
import lecturaarchivo.*;

import javax.swing.*;

void main()  {

    try {
        LeerArchivoBasico.leerArchivoF1();
    }catch (NullPointerException | IOException e){
        JOptionPane.showMessageDialog(
                null,"No se ha seleccionado el archivo");
    }

    try {
        LeerArchivoBasico.leerArchivoF2();
    }catch (NullPointerException  e){
        JOptionPane.showMessageDialog(
                null,"No se ha seleccionado el archivo");
    }



}