package com.softlond.ejercicio.cuatro.comandos;

import java.util.Scanner;
import com.softlond.ejercicio.cuatro.Cliente;
import com.softlond.ejercicio.cuatro.Hotel;
import com.softlond.ejercicio.cuatro.mensaje.MensajeError;
import com.softlond.ejercicio.cuatro.mensaje.MensajeExito;

public class ComandoRegistrarCliente implements Comando {
    private final Hotel hotel;
    private String nombreCliente;
    private int telefonoCliente;
    private int cedulaCliente;
    private int edadCliente;
    private Cliente clienteRegistrado;
    


    public ComandoRegistrarCliente(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
public void ejecutar() {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Nombre del cliente: ");
        nombreCliente = scan.next();
        System.out.print("Ingrese edad: ");
        edadCliente = scan.nextInt();
        System.out.print("Número de teléfono: ");
        telefonoCliente = scan.nextInt();
        System.out.print("Número de Cédula: ");
        cedulaCliente = scan.nextInt();
        clienteRegistrado = new Cliente(cedulaCliente, nombreCliente, cedulaCliente, telefonoCliente);

        if (hotel.registrarCliente(clienteRegistrado)) {
            new MensajeExito("Cliente registrado exitosamente.").mostrar();
            scan.nextLine();
        } else {
            new MensajeError("El cliente ya existe.").mostrar();
            scan.nextLine();
        }
        
    }
}

    public Hotel getHotel() {
        return hotel;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public Cliente getClienteRegistrado() {
        return clienteRegistrado;
    }

    public void setClienteRegistrado(Cliente clienteRegistrado) {
        this.clienteRegistrado = clienteRegistrado;
    }


    
}
