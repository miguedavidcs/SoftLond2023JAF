package com.softlond.ejercicio.cuatro.comandos;

import java.util.Scanner;

import com.softlond.ejercicio.cuatro.Cliente;
import com.softlond.ejercicio.cuatro.Habitacion;
import com.softlond.ejercicio.cuatro.Hotel;
import com.softlond.ejercicio.cuatro.mensaje.MensajeError;
import com.softlond.ejercicio.cuatro.mensaje.MensajeExito;

public class ComandoHacerReserva implements Comando {
    private final Hotel hotel;

    public ComandoHacerReserva(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre del cliente: ");
            String nombreCliente = scanner.next();
            System.out.print("Ingrese edad: ");
            int edadCliente = scanner.nextInt();
            System.out.print("Número de teléfono: ");
            int telefonoCliente = scanner.nextInt();
            System.out.print("Número de Cédula: ");
            int cedulaCliente = scanner.nextInt();
            Cliente cliente = new Cliente(cedulaCliente, nombreCliente, edadCliente, telefonoCliente);

            System.out.println("Habitaciones disponibles:");
            hotel.mostrarHabitacionesDisponibles();
            System.out.print("Ingrese el número de habitación: ");
            int numeroHabitacion = scanner.nextInt();
            scanner.nextLine();

            Habitacion habitacionSeleccionada = hotel.getHabitaciones().get(numeroHabitacion - 1);

            System.out.print("Fecha de entrada (YYYY-MM-DD): ");
            String fechaEntrada = scanner.next();
            System.out.print("Fecha de salida (YYYY-MM-DD): ");
            String fechaSalida = scanner.next();

            if (hotel.reservarHabitacion(cliente, habitacionSeleccionada, fechaEntrada, fechaSalida)) {
                new MensajeExito("Reserva exitosa.").mostrar();
            } else {
                new MensajeError("La habitación no está disponible para reserva.").mostrar();
            }
        }         
    }
}
