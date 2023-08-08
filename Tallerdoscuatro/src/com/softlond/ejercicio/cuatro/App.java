package com.softlond.ejercicio.cuatro;

import java.util.Scanner;

import com.softlond.ejercicio.cuatro.model.Cliente;
import com.softlond.ejercicio.cuatro.model.Habitacion;
import com.softlond.ejercicio.cuatro.model.Hotel;
import com.softlond.ejercicio.cuatro.model.Reserva;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel1 = Hotel.getInstance("Hotel A");
        for (int i = 101; i <= 110; i++) {
            hotel1.agregarHabitacion(new Habitacion(i));
        }

        System.out.println("¡Bienvenido al sistema de reservas de hotel!");

        System.out.print("¿Cuántos clientes desea agregar? ");
        int numClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Cliente[] clientes = new Cliente[numClientes];
        for (int i = 0; i < numClientes; i++) {
            System.out.print("Ingrese el nombre de su empresa (Cliente " + (i + 1) + "): ");
            String nombreEmpresa = scanner.nextLine();
            System.out.print("Ingrese su nombre: ");
            String nombrePersona = scanner.nextLine();
            System.out.print("Ingrese su cédula: ");
            String cedula = scanner.nextLine();
            clientes[i] = new Cliente(nombreEmpresa, nombrePersona, cedula);
        }

        for (Cliente cliente : clientes) {
            System.out.println("Habitaciones disponibles en " + hotel1.getNombre() + ":");
            for (Habitacion habitacion : hotel1.listarHabitacionesDisponibles()) {
                System.out.println("Habitación " + habitacion.getNumero());
            }

            System.out.print("Ingrese el número de habitación que desea reservar para " + cliente.getNombrePersona() + ": ");
            int numeroHabitacion = scanner.nextInt();
            Habitacion habitacionSeleccionada = null;
            for (Habitacion habitacion : hotel1.listarHabitacionesDisponibles()) {
                if (habitacion.getNumero() == numeroHabitacion) {
                    habitacionSeleccionada = habitacion;
                    break;
                }
            }

            if (habitacionSeleccionada != null) {
                Reserva reserva = new Reserva(hotel1, habitacionSeleccionada, cliente);
                System.out.println("Reserva realizada con éxito para " + cliente.getNombrePersona() + ":");
                System.out.println("Nombre de la empresa: " + reserva.getCliente().getNombreEmpresa());
                System.out.println("Nombre y cédula del ocupante de la habitación: " + reserva.getCliente().getNombrePersona() + " - " + reserva.getCliente().getCedula());
            } else {
                System.out.println("La habitación seleccionada no está disponible.");
            }
        }

        scanner.close(); 
    }
}





