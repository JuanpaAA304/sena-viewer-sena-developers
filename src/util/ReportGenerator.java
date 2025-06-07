package util;

import java.time.LocalDateTime;

public class ReportGenerator {

    public static void generarReporteGeneral() {
        System.out.println(">> Reporte General:");
        System.out.println("Películas vistas: ...");
        System.out.println("Libros leídos: ...");
        System.out.println("Series vistas: ...");
        System.out.println("Revistas consultadas: ...");
        // Aquí iría la lógica real en versiones avanzadas
    }

    public static void generarReporteDelDia() {
        System.out.println(">> Reporte del día: " + LocalDateTime.now().toLocalDate());
        // Aquí simularías que solo muestra contenido visto hoy
    }
}

