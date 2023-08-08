package com.softlond.ejercicio.cuatro.model;


public class Habitacion {
    private int numero;
    private boolean reservada;
    private Cliente cliente;

    public Habitacion(int numero) {
        this.numero = numero;
        this.reservada = false;
        this.cliente = null;
    }

    public boolean reservar(Cliente cliente) {
        if (!reservada) {
            this.reservada = true;
            this.cliente = cliente;
            return true;
        }
        return false;
    }

    public boolean cancelarReserva() {
        if (reservada) {
            this.reservada = false;
            this.cliente = null;
            return true;
        }
        return false;
    }

    public boolean estaReservada() {
        return reservada;
    }

    public int getNumero() {
        return numero;
    }
}

