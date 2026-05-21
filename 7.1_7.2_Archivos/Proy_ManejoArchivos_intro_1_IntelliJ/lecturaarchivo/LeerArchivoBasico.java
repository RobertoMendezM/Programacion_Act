/**
 * Programa que implementa metodos para lectura de  archivos
 * de texto o csv
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

package lecturaarchivo;

import java.io.*;
import java.util.Scanner;

import selectordearchivo.*;

import javax.swing.*;

public class LeerArchivoBasico {

    public static void leerArchivoF1() throws IOException{
        String texto;

        File f = SelectorGraficoDeArchivo1.seleccionaArchivo1();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        while ((texto = br.readLine()) != null) {
            System.out.println(texto);
        }
        br.close();
    }

    public static void leerArchivoF2() {
        File f = SelectorGraficoDeArchivo2.seleccionaArchivo2();

        Scanner archivo  = null;

        try {
            archivo = new Scanner(f);
            while (archivo.hasNextLine()) {
                System.out.println(archivo.nextLine());
            }
            archivo.close();
        } catch (FileNotFoundException e) {
            System.err.println("No leí nada");
        } catch(IllegalStateException e){
            JOptionPane.showMessageDialog(null,"Ya se había cerrardo");
        }

    }
}
