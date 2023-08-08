package com.softlond.ejercicio.cuatro.comandos;

import java.util.Scanner;
import com.softlond.ejercicio.cuatro.Cliente;
import com.softlond.ejercicio.cuatro.Hotel;
import com.softlond.ejercicio.cuatro.mensaje.MensajeError;

public class ComandoRegistrarCliente implements Comando {
    private final Hotel hotel;
    
    public ComandoRegistrarCliente(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void ejecutar() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Nombre del cliente: ");
            String nombreCliente = scan.next();
            System.out.println("Ingrese edad: ");
            int edadCliente = scan.nextInt();
            System.out.println("Número de teléfono: ");
            int telefonoCliente = scan.nextInt();
            System.out.println("Número de Cédula: ");
            int cedulaCliente = scan.nextInt();
            
            Cliente clienteRegistrado = new Cliente(cedulaCliente, nombreCliente, edadCliente, telefonoCliente);

            if (hotel.registrarCliente(clienteRegistrado)) {
                // Registro exitoso
                System.out.println("Cliente registrado exitosamente.");
                ComandoHacerReserva comandoHacerReserva = new ComandoHacerReserva(hotel);
                comandoHacerReserva.ejecutar();
            } else {
                new MensajeError("El cliente ya existe.").mostrar();
            }
        }
    }
}
