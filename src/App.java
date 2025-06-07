import java.util.Scanner;

import util.ReportGenerator;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("===== SENA Viewer =====");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(">> Mostrando películas...");
                    break;
                case 2:
                    System.out.println(">> Mostrando series...");
                    break;
                case 3:
                    System.out.println(">> Mostrando libros...");
                    break;
                case 4:
                    System.out.println(">> Mostrando revistas...");
                    break;
                case 5:
                    ReportGenerator.generarReporteGeneral();
                    break;
                case 6:
                    ReportGenerator.generarReporteDelDia();
                    break;

                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();

        } while (option != 0);

        scanner.close();
    }
}
