/**
 * Programa que Lee los datos de un archivo de texto o csv

 * Curso: Programación  2026-2

 * Referencias:

 * Software
 *      Java 25
 *      IDE IntelliJ 2026.1.2

 * @author Roberto Méndez Méndez
 * Creación:  Nov 2021
 * Edición:   24 May 2026
 */
import lecturaarchivo.*;

import javax.swing.*;

void main()  {

    try {
        LeerArchivoBasico_Tarea.leerArchivoF1();
    }catch (NullPointerException | IOException e){
        JOptionPane.showMessageDialog(
                null,"No se ha seleccionado el archivo");
    }

    try {
        LeerArchivoBasico_Tarea.leerArchivoF2();
    }catch (NullPointerException  e){
        JOptionPane.showMessageDialog(
                null,"No se ha seleccionado el archivo");
    }



}