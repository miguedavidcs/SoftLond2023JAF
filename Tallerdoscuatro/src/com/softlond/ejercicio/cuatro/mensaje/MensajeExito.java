package com.softlond.ejercicio.cuatro.mensaje;

public class MensajeExito implements Mensaje{
    private final String mensaje;
    public MensajeExito(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void mostrar() {
        System.out.println("¡Éxito! " + mensaje);
    }
}
