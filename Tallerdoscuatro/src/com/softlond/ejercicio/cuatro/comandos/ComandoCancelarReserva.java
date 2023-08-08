package com.softlond.ejercicio.cuatro.comandos;

import java.util.Scanner;

import com.softlond.ejercicio.cuatro.Cliente;
import com.softlond.ejercicio.cuatro.Habitacion;
import com.softlond.ejercicio.cuatro.Hotel;
import com.softlond.ejercicio.cuatro.mensaje.MensajeError;
import com.softlond.ejercicio.cuatro.mensaje.MensajeExito;

public class ComandoCancelarReserva implements Comando {
    private final Hotel hotel;

    public ComandoCancelarReserva(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre del cliente: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("Ingrese edad: ");
            int edadCliente = scanner.nextInt();
            System.out.print("Número de teléfono: ");
            int telefonoCliente = scanner.nextInt();
            System.out.print("Número de Cédula: ");
            int cedulaCliente = scanner.nextInt();
            Cliente cliente = new Cliente(cedulaCliente, nombreCliente, edadCliente, telefonoCliente);

            System.out.println("Reservas del cliente:");
            hotel.mostrarReservasCliente(cliente);
            System.out.print("Ingrese el número de habitación de la reserva a cancelar: ");
            int numeroHabitacion = scanner.nextInt();
            scanner.nextLine();

            Habitacion habitacionSeleccionada = hotel.getHabitaciones().get(numeroHabitacion - 1);

            if (hotel.cancelarReserva(cliente, habitacionSeleccionada)) {
                new MensajeExito("Reserva cancelada.").mostrar();
                ComandoMostrarReservas comandoMostrarReservas = new ComandoMostrarReservas(hotel);
                comandoMostrarReservas.ejecutar();
            } else {
                new MensajeError("No se pudo cancelar la reserva.").mostrar();
            }
        }
    }
}
