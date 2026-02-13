/**
 * Programa para ejemplificar
 * los distintos tipos en JAVA y sus
 * wrapped (Encapsulamientos)
 *
 * Curso: Programación
 * Tema: 2.1 Tipos
 *
 * Objetivo: mostrar las declaraciones  de los tipos
 *           primitivos básicos en java y sus respectivas
 *           “wrapper classes”, además de como se relacionan.
 *
 * Referencias:
 * - https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Math.html
 * - https://docs.oracle.com/en/java/javase/25/docs/api//java.base/java/lang/Integer.html
 * - https://docs.oracle.com/en/java/javase/25/docs/api//java.base/java/lang/Float.html
 *
 * Software: Java 25
 *           IDE IntelliJ 2025.3.1
 *
 * Compilador Online:
 *  https://dev.java/playground/
 *  -- Selecciona: Detailed output
 *
 * @author  Roberto Méndez Méndez
 * Creado:  20-Feb-23
 * Editado: 12 Feb 2026
 */

void main() {
    //Type  byte - Byte
    byte b = 100;
    /* Aunque Byte es una clase no requieres declarar
     Byte b2= new Byte(-120); */
    Byte b2 = -120;
    IO.println("byte: " + b);
    b = b2;
    IO.println("byte = Byte da: " + b);

    //Type short - Short
    short sh = -32768;
    Short sh2 = 32767;
    IO.println("String short + Short: "+sh+sh2);
    IO.println("Suma short + Short= "+(sh+sh2));

    //Type int - Integer
    int n = Math.powExact(2, 30);
    Integer i = 2147483647;
    IO.println("El máximo entre int e Integer es: %d".
                        formatted(Integer.max(i,n)));

    //Type long - Long
    // El número lleva  "L" al final
    long l = 9223372036854775807L;
    Long l2 = -1*(Math.powExact(-2L,63)+1);
    IO.println("Long de 2^63-1 es: " + l2);

    /*Type float - Float
     El número debe llevar  "f" al final*/
    float f = 673093.1234f;
    // Busco poner el valor máximo para float
    // Math.pow regresa un tipo double, hago un cast
    Float g = (float) (3.4 * Math.pow(10, 38));
    IO.println("Float de 3.4*10^38 es: " + g);
    IO.println("El penúltimo Float es: " + Math.nextDown(g) );

    //Type double - Double
    double d = 673093.1234;
    Double d2 = 0.3;
    System.out.printf("Double d2 vale %f and doble d " +
                       "es %f \n",d2,d);

    //Type char  - Double
    char amor = '\u2661';  //  "heart"
    Character amistad = '\u270C'; // "peace and love"
    IO.println("Feliz día del "+ amor + " y " + amistad);

    //Type boolean  - Boolean
    boolean tu_puedes = true;
    Boolean alcanza_tus_metas = true;
    if (tu_puedes == alcanza_tus_metas){
        IO.println("No hay duda ¡alcanzarás tus sueños!");
    }
}