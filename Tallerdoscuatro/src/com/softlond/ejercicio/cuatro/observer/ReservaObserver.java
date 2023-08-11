package com.softlond.ejercicio.cuatro.observer;
import java.util.Observable;
import java.util.Observer;

import com.softlond.ejercicio.cuatro.model.Reserva;

public class ReservaObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Reserva) {
            Reserva reserva = (Reserva) arg;
            System.out.println("Nueva reserva realizada en " + reserva.getHotel().getNombre());
            System.out.println("Habitación " + reserva.getHabitacion().getNumero() + " reservada para " + reserva.getCliente().getNombrePersona());
        }
    }
}

