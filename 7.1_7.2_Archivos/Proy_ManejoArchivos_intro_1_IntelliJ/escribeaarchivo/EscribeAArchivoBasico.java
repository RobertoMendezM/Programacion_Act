/**
 * Programa que implementa mecanismos muy básicos para escritura  a  archivos
 * de texto o csv

 * Curso: Programación  2026-2

 * Referencias:
 *  - https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/FileWriter.html
 *  - https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 *  - https://docs.oracle.com/en/java/javase/25/docs/api//java.base/java/io/BufferedWriter.html

 * Software
 *      Java 25
 *      IDE IntelliJ 2026.1.2

 * @author Roberto Méndez Méndez ; DeepSeek
 * Creación:  Nov 2021
 * Edición:   27 May 2026
 */
package escribeaarchivo;

import java.io.*;


public class EscribeAArchivoBasico {

    /**
     * Escribe al archivo escribe.txt
     * Si no existe lo crea, si ya existe escribe al final de él.
     * Utiliza BufferedWriter
     * @throws IOException
     */
    public static void escribirAArchivoF1() throws IOException{
        BufferedWriter escribe =
                new BufferedWriter(
                        new FileWriter("ArchivosDePrueba\\escribe.txt",
                                true));

        escribe.append("\nSe acabó :) \n");
        escribe.append("Solo me resta ");
        escribe.append("desearles lo mejor. \n");

        escribe.close();

    }

    /**
     *  Crea el archvo data.csv, si ya existe lo sobreescribe
     *  Utiliza: PrintWriter (ver doc de BufferedWriter)
     *           try-with-resources (ver información en referencia)
     */
    public static void escribirAArchivoF2() {
        String csvFile = "ArchivosDePrueba\\data.csv";

        try (PrintWriter writer = new
                PrintWriter(new FileWriter(csvFile))) {
            // Write header
            writer.println("ID,Name,Age,City,Salary");

            // Write data rows
            writer.println("1,John Doe,25,New York,50000");
            writer.println("2,Jane Smith,30,Los Angeles,60000");
            writer.println("3,Bob Johnson,35,Chicago,55000");

            System.out.println("CSV file created successfully: " +
                    csvFile);

        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " +
                    e.getMessage());
        }
    }

    /**
     *  Escribe al archivo tiendita2.csv
     *  Utiliza: PrintWriter (ver doc de BufferedWriter)
     *           try-catch-finally
     *           En ésta forma se debe usar flush() y close()
     */
    public static void escribirAArchivoF3() {
        String csvFile = "ArchivosDePrueba\\tiendita2.csv";

        PrintWriter writer = null;
        try {
            writer = new
                    PrintWriter(new BufferedWriter(
                            new FileWriter(csvFile, true)));
            // Write data rows
            writer.println("2001,2001,compra,panqueso,10,230,2026-05-25");

            writer.flush();
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " +
                    e.getMessage());
        } finally {
            if (writer != null) {
                writer.close(); // REQUERIDO
            }
        }
    }


}
