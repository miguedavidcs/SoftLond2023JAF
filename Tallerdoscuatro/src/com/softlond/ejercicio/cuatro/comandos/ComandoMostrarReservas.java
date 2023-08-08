package com.softlond.ejercicio.cuatro.comandos;

import com.softlond.ejercicio.cuatro.Hotel;

public class ComandoMostrarReservas implements Comando {
    private Hotel hotel;

    public ComandoMostrarReservas(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void ejecutar() {
        System.out.println("Reservas en el hotel:\n");
        hotel.mostrarReservas();
    }
}
