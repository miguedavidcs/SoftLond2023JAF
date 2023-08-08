package com.softlond.ejercicio.cuatro.model;


import java.util.Observable;

import com.softlond.ejercicio.cuatro.observer.ReservaObserver;

public class Reserva extends Observable {
    private Hotel hotel;
    private Habitacion habitacion;
    private Cliente cliente;

    public Reserva(Hotel hotel, Habitacion habitacion, Cliente cliente) {
        this.hotel = hotel;
        this.habitacion = habitacion;
        this.cliente = cliente;

        hotel.addObserver(new ReservaObserver()); // Agregar el observador al hotel
        setChanged();
        notifyObservers(this);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean cancelarReserva() {
        if (habitacion.estaReservada()) {
            habitacion.cancelarReserva();
            return true;
        }
        return false;
    }
}