/**
 * Curso: Programación
 *
 * Objetivo: Ver caracteristicas de la herencia al definir una instancia
 *           (variable) de una clase hijo y que pasa al mandar a
 *           imprimir un Obtejo
 *
 * Intención: Motivar la sobreescritura (plimorfismo) del método toString
 *
 * @author Roberto Méndez Méndez
 * Creación:  23 Abr 2026
 */

void main() {

    Item miFlorero =
            new Florero(1938.50, "Leonardo", 1,
                        "Vidrio soplado");

    IO.println("Las caractersiticas de mi florero son:");
    IO.println(miFlorero);
}