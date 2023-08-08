package com.softlond.ejercicio.cuatro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Hotel extends Observable {
    private static Hotel instance; // Singleton instance
    private String nombre;
    private List<Habitacion> habitaciones;

    private Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public static Hotel getInstance(String nombre) {
        if (instance == null) {
            instance = new Hotel(nombre);
        }
        return instance;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public List<Habitacion> listarHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.estaReservada()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public String getNombre() {
        return nombre;
    }
}

