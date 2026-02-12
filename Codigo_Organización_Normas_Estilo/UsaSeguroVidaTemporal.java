/**
 * Programa que utiliza la clase (crea una instancia de)
 *    SeguroVitaTemporal y su clase interna Beneficiario
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

public class UsaSeguroVidaTemporal {
    public static void main(String[] args) {
        // Crear una póliza de seguro
        SeguroVidaTemporal poliza = new SeguroVidaTemporal(
                "Juan Pérez",
                35,      // Edad
                20,      // Duración en años
                100000,  // Suma asegurada
                0.05     // Tasa de interés 5%
        );

        // Mostrar información de la póliza
        poliza.mostrarInformacionPoliza();

        // Calcular y mostrar prima neta
        double primaNeta = poliza.calcularPrimaNeta();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Prima Neta calculada: $"
                                  + df.format(primaNeta));

        // Calcular reserva matemática después de 5 años
        double reserva5years =
                poliza.calcularReservaMatematica(5);
        System.out.println("Reserva Matemática a 5 años: $" +
                df.format(reserva5years));

        // Ejemplo de uso de la clase interna Beneficiario
        SeguroVidaTemporal.Beneficiario beneficiario =
                    poliza.new Beneficiario( "María Pérez",
                                             "Esposa",
                                             100.0);

        System.out.println("\nBeneficiario: " +
                beneficiario.calcularBeneficio());

        // Ejemplo de actualización de datos
        poliza.setEdad(36);
        System.out.println("\nDespués de actualizar edad a 36:");
        System.out.println("Nueva Prima: $" +
                df.format(poliza.calcularPrimaNeta()));
    }
}
