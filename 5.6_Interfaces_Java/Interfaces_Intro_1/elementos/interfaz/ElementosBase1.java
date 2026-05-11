/**
 * Curso: Programación
 *
 * Temas: interface Elementos Básicos
 *          - atributos (campos). siempre son public, static y final
 *          - métodos: abstract, default, static and private
 *        package
 *
 * Extendida por:
 *      HeredoInterfaces
 *
 * Implementada en:
 *
 * Software:
 *      Java 8 y 25
 *
 * @author Roberto Méndez Méndez
 * Creación 20/ May/ 22
 * Edición  10 Mayo 2026
 */

package elementos.interfaz;

public interface ElementosBase1 {
    // Atributos. implícitamente public, static y final
    int x = 3;
    String str = "Soy públic, static & final";

    // MÉTODOS

    /**
     * Ejemplo de método public and abstract
     * @param pasameAlgo
     */
    void debesImplementar(String pasameAlgo);


    // A partir de Java 8 acepta default y static
    /**
     * Ejemplo de método public y default
     */
    default void soyDefault(){
        System.out.println("it's a default method");
    }

    /**
     * Ejemplo de método public y static
     */
    static void soyStatic(){
        System.out.println("Je suis static");
    }

    // A partir de Java 9 acepta "private"
    /**
     * Ejemplo de método private
     */
    private void soyPrivado(){
        System.out.println("Acepta 'private' " +
                                "a partir de Java 9");}

    private static void soyStaticPrivate(String pasameAlgo){
        System.out.println("De algo serviré");
    }

    //Se  ejeplifica el uso de métodos privados dentro de la interfaz
    default void usaPrivado(){
        soyPrivado();
        soyStaticPrivate("llamada desde método default");
    }

    static void usaStaticPrivate(){
        soyStaticPrivate("llamada desde método static default");
    }
}
