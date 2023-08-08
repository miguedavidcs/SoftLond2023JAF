import java.util.Scanner;

import com.softlond.ejercicio.cuatro.Hotel;
import com.softlond.ejercicio.cuatro.comandos.*;

public class App {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(Constantes.NUM_HABITACIONES);
        ComandoRegistrarCliente comandoRegistrarCliente = new ComandoRegistrarCliente(hotel);
        ComandoHacerReserva comandoHacerReserva = new ComandoHacerReserva(hotel);
        ComandoCancelarReserva comandoCancelarReserva = new ComandoCancelarReserva(hotel);
        ComandoMostrarReservas comandoMostrarReservas = new ComandoMostrarReservas(hotel);

        System.out.println("Bienvenido al Hotel");

        try (Scanner scanner = new Scanner(System.in)) {
            boolean salir = false;

            while (!salir) {
                System.out.println("\n¿Qué acción deseas realizar?");
                System.out.println("1. Registrar nuevo cliente");
                System.out.println("2. Hacer una reserva");
                System.out.println("3. Cancelar una reserva");
                System.out.println("4. Mostrar reservas");
                System.out.println("5. Salir");

                if (scanner.hasNext()) {
                    String opcion = scanner.next();

                    switch (opcion) {
                        case "1":
                            comandoRegistrarCliente.ejecutar();
                            break;

                        case "2":
                            comandoHacerReserva.ejecutar();
                            break;

                        case "3":
                            comandoCancelarReserva.ejecutar();
                            break;

                        case "4":
                            comandoMostrarReservas.ejecutar();
                            break;

                        case "5":
                            salir = true;
                            System.out.println("\n¡Hasta luego!");
                            break;

                        default:
                            System.out.println("\nOpción inválida. Por favor, elige una opción válida.");
                            break;
                    }
                } else {
                    salir = true;
                    System.out.println("\n¡Hasta luego!");
                }

                if (!salir) {
                    System.out.println("\nPresiona ENTER para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER
                }
            }
        }
    }
}
