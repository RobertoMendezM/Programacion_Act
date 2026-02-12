/**
 * Programa que modela la poliza de un seguro de vida temporal
 *   - calcula la "Prima neta nivelada",
 *   - imprime la póliza
 *   - Calcula la "Reserva matemática"
 *
 * Define una Clase interna llamada "Beneficiario"
 * que calcula el porcentaje de beneficio de un beneficiario
 *
 *
 *  Tema: 1.3 y 1.4 Organización general de un Programa
 *         y Normas de estilo
 *
 *  Fórmula simplificada de prima neta nivelada:
 *          P = (Suma Asegurada * q_x) / (1 + i - p_x)
 *   q_x   probabilidad de muerte,
 *   p_x   probabilidad de supervivencia
 *   i     tasa de interés
 *
 * Software:
 *     JDK 25
 *     IDE IntelliJ IDEA 2025.3.1
 *
 * @author Deepseek
 * Editor: Roberto Méndez
 * Fecha : 11 Feb 2026
 */

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * CLASE
 */
public class SeguroVidaTemporal {

    // Variables privadas
    private String asegurado;
    private int edad;
    private int duracionSeguro;
    private double sumaAsegurada;
    private double tasaInteres;

    // Variable protegida - accesible en subclases
    protected String numeroPoliza;

    // CONSTRUCTOR
    public SeguroVidaTemporal(String asegurado, int edad, int duracionSeguro,
                              double sumaAsegurada, double tasaInteres) {
        this.asegurado = asegurado;
        this.edad = edad;
        this.duracionSeguro = duracionSeguro;
        this.sumaAsegurada = sumaAsegurada;
        this.tasaInteres = tasaInteres;
        this.numeroPoliza = generarNumeroPoliza();
    }

    /* MÉTODOS */

    // MÉTODO privado para generar número de póliza
    private String generarNumeroPoliza() {
        return "POL-" + LocalDate.now().getYear() + "-" +
                (int)(Math.random() * 10000);
    }

    // Método cálculo actuarial - Prima Neta Nivelada
    public double calcularPrimaNeta() {
        double qx = calcularProbabilidadMuerte(edad);
        double px = 1 - qx;
        // Validación básica
        if (tasaInteres <= 0 || qx <= 0) {
            return 0;
        }
        // Cálculo de prima neta anual
        double prima =
                (sumaAsegurada * qx) / (1 + tasaInteres - px);

        return prima;
    }

    // Método protegido para calcular probabilidad de muerte (tabla simplificada)
    protected double calcularProbabilidadMuerte(int edadActual) {
        // Tabla de mortalidad simplificada (probabilidades hipotéticas)
        if (edadActual < 20) return 0.0005;
        if (edadActual < 30) return 0.001;
        if (edadActual < 40) return 0.002;
        if (edadActual < 50) return 0.005;
        if (edadActual < 60) return 0.015;
        if (edadActual < 70) return 0.035;
        return 0.080; // 70+ años
    }

    // Método público para calcular la reserva matemática (simplificado)
    public double calcularReservaMatematica(int aniosTranscurridos) {
        if (aniosTranscurridos <= 0 || aniosTranscurridos > duracionSeguro) {
            return 0;
        }

        double primaPagada = calcularPrimaNeta();
        double qx = calcularProbabilidadMuerte(edad + aniosTranscurridos);

        // Fórmula simplificada de reserva
        double reserva = primaPagada * aniosTranscurridos *
                Math.pow(1 + tasaInteres, aniosTranscurridos) *
                (1 - qx);

        return reserva;
    }

    // Métodos getters y setters para variables privadas
    public String getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(String asegurado) {
        this.asegurado = asegurado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            this.edad = edad;
        }
    }

    public int getDuracionSeguro() {
        return duracionSeguro;
    }

    public double getSumaAsegurada() {
        return sumaAsegurada;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    // Método para mostrar información de la póliza
    public void mostrarInformacionPoliza() {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("\n=== INFORMACIÓN DE LA PÓLIZA ===");
        System.out.println("Número de Póliza: " + numeroPoliza);
        System.out.println("Asegurado: " + asegurado);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Duración del Seguro: " + duracionSeguro + " años");
        System.out.println("Suma Asegurada: $" + df.format(sumaAsegurada));
        System.out.println("Tasa de Interés: " + (tasaInteres * 100) + "%");
        System.out.println("Prima Neta Anual: $" + df.format(calcularPrimaNeta()));
        System.out.println("===============================\n");
    }

    // CLASE INTERNA para ejemplo de composición
    public class Beneficiario {
        private String nombre;
        private String parentesco;
        private double porcentajeBeneficio;

        public Beneficiario(String nombre, String parentesco, double porcentajeBeneficio) {
            this.nombre = nombre;
            this.parentesco = parentesco;
            this.porcentajeBeneficio = porcentajeBeneficio;
        }

        public double calcularBeneficio() {
            return sumaAsegurada * (porcentajeBeneficio / 100);
        }
    }
}
