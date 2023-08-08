
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.softlond.ejercicio.cuatro.Hotel;
import com.softlond.ejercicio.cuatro.comandos.ComandoCancelarReserva;
import com.softlond.ejercicio.cuatro.comandos.ComandoHacerReserva;
import com.softlond.ejercicio.cuatro.comandos.ComandoMostrarReservas;
import com.softlond.ejercicio.cuatro.comandos.ComandoRegistrarCliente;

public class App {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Hotel hotel = new Hotel(Constantes.NUM_HABITACIONES);

            ComandoRegistrarCliente comandoRegistrarCliente = new ComandoRegistrarCliente(hotel);
            ComandoHacerReserva comandoHacerReserva = new ComandoHacerReserva(hotel);
            ComandoCancelarReserva comandoCancelarReserva = new ComandoCancelarReserva(hotel);
            ComandoMostrarReservas comandoMostrarReservas = new ComandoMostrarReservas(hotel);

            System.out.print("Bienvenido al Hotel XYZ\n");

            boolean salir = false;

            while (!salir) {
                System.out.print("\n¿Qué acción deseas realizar?");
                System.out.print("\n1. Registrar nuevo cliente");
                System.out.print("\n2. Hacer una reserva");
                System.out.print("\n3. Cancelar una reserva");
                System.out.print("\n4. Mostrar reservas");
                System.out.print("\n5. Salir");

                String opcion = reader.readLine();

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
                        System.out.print("\n¡Hasta luego!");
                        break;

                    default:
                        System.out.print("\nOpción inválida. Por favor, elige una opción válida.");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
