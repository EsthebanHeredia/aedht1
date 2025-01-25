import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Licuadora miLicuadora = new LicuadoraSimple();
        int opcion;

        do {
            System.out.println("\n===== MENÚ LICUADORA =====");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Llenar");
            System.out.println("4. Vaciar");
            System.out.println("5. Servir");
            System.out.println("6. Incrementar velocidad");
            System.out.println("7. Disminuir velocidad");
            System.out.println("8. Consultar velocidad");
            System.out.println("9. Consultar si está llena");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();  // Lee la opción seleccionada por el usuario
                switch (opcion) {
                    case 1: miLicuadora.encender(); break;
                    case 2: miLicuadora.apagar(); break;
                    case 3:
                        System.out.print("Ingrese cantidad en ml: ");
                        double volumen = scanner.nextDouble();
                        miLicuadora.llenar(volumen);
                        break;
                    case 4:
                        miLicuadora.vaciar();
                        System.out.println("Licuadora vaciada.");
                        break;
                    case 5:
                        System.out.print("Ingrese cantidad en ml a servir: ");
                        double servir = scanner.nextDouble();
                        miLicuadora.servir(servir);
                        break;
                    case 6: miLicuadora.incrementarVelocidad(); break;
                    case 7: miLicuadora.decrecerVelocidad(); break;
                    case 8: miLicuadora.consultarVelocidad(); break;
                    case 9:
                        if (miLicuadora.estaLlena()) {
                            System.out.println("La licuadora tiene contenido.");
                        } else {
                            System.out.println("La licuadora está vacía.");
                        }
                        break;
                    case 10: System.out.println("Saliendo del programa..."); break;
                    default: System.out.println("Opción inválida. Intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next();  // Limpia el buffer
                opcion = 0;  // Evita salir del bucle
            }

        } while (opcion != 10);  // Repite hasta que elija salir

        scanner.close();  // Cierra el scanner al final
    }
}