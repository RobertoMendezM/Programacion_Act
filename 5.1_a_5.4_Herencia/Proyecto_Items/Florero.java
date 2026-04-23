/**
 * Curso: Programación
 *
 * Referencias:
 *      Book: Sage, (2019).Concise Guide to Object-Oriented Programming An
 *            Accessible Approach Using Java, Springer. pág 81
 *
 * Temas: Herencia, Polimorfismo
 *
 * Editor: Roberto Méndez Méndez
 * Creación: 16/ Mar/ 22 v2
 * Editado:  23 Abril 2026
 */

public class Florero extends Item {

    private int capacity;
    private String material;
    private String modelo;

    public Florero(double value, String creator,
                   int capacity, String material) {
        // llama al constructor de la clase padre
        super(value, creator);
        this.capacity = capacity;
        this.material = material;
    }

    @Override
    public double valorReal() {
        double valorActual = value;
        if (!Condicion)
            valorActual = value * 0.9;

        return valorActual;
    }

}
