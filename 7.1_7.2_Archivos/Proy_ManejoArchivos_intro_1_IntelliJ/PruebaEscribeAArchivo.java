/**
 * Programa que Lee los datos de un archivo de texto o csv

 * Curso: Programación  2026-2

 * Referencias:

 * Software
 *      Java 25
 *      IDE IntelliJ 2026.1.2

 * @author Roberto Méndez Méndez
 * Creación: 24 May 2026
 */


import escribeaarchivo.*;

void main(String[] args) {
    try{
    EscribeAArchivoBasico.escribirAArchivoF1();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    try {
        EscribeAArchivoBasico.escribirAArchivoF2();
    }catch (NullPointerException  e){
        throw new RuntimeException(e);
    }

    EscribeAArchivoBasico.escribirAArchivoF3();

}