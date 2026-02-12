/**
 * Programa que Calcula el Interés Compuesto
 *
 * Tema:  1.3 y 1.4 Organización general de un Programa
 *         y Normas de estilo
 *
 *  Fórmula empleada:
 *              M = P * (1 + r/n)^(n*t)
 *  P  Capital inicial
 *  r  tasa de interés
 *  n  Capitalización anual o mensual (12 meses)
 *  t  # años
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
import java.util.Scanner;

public class InteresCompuestoSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("=== CALCULADORA DE INTERÉS COMPUESTO ===");

        // Entrada de datos
        System.out.print("Capital inicial: $");
        double capital = scanner.nextDouble();

        System.out.print("Tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble();

        System.out.print("Años de inversión: ");
        int años = scanner.nextInt();

        System.out.print("Capitalizaciones " +
                "por año (1=anual, 12=mesual): ");
        int capitalizaciones = scanner.nextInt();

        // Cálculo del interés compuesto
        // Fórmula: M = P * (1 + r/n)^(n*t)
        double tasaDecimal = tasaAnual / 100;
        double montoFinal = capital * Math.pow(1 +
                                (tasaDecimal / capitalizaciones),
                                    capitalizaciones * años);

        // Resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Capital inicial: $" +
                                       df.format(capital));
        System.out.println("Tasa anual: " + tasaAnual + "%");
        System.out.println("Periodo: " + años + " años");
        System.out.println("Capitalizaciones por año: " +
                               capitalizaciones);
        System.out.println("Monto final: $" +
                                 df.format(montoFinal));
        System.out.println("Interés ganado: $" +
                             df.format(montoFinal - capital));

        // Cierra el canal abiero previamente a la
        // entrada por línea de comandos
        scanner.close();
    }
}