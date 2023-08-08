package com.softlond.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Reverva> revervas = new ArrayList<>();

    public Hotel(int numHabitaciones) {
        for (int i = 1; i <= numHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public void mostrarHabitacionesDisponibles() {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                System.out.println("Habitación #" + habitacion.getNumero() + " disponible");
            }
        }
    }

    public boolean registrarCliente(Cliente cliente) {
        
        return true;
    }

    public boolean reservarHabitacion(Cliente cliente, Habitacion habitacion, String fechaEntrada, String fechaSalida) {
        
        return true;
    }

    public boolean cancelarReserva(Cliente cliente, Habitacion habitacion) {
        
        return true;
    }

    public void mostrarReservasCliente(Cliente cliente) {
        
    }

    public void mostrarReservas() {
        for (Reverva reserva : revervas) {
            System.out.println("Reserva en habitación #" + reserva.getHabitacion().getNumero() +
                               " para " + reserva.getCliente().getNombre());
        }
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Reverva> getReservas() {
        return revervas;
    }

    public void setReservas(List<Reverva> revervas) {
        this.revervas = revervas;
    }
}
