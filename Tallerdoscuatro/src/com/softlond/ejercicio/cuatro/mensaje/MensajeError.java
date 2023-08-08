package com.softlond.ejercicio.cuatro.mensaje;

public class MensajeError implements Mensaje{
    private final String mensaje;

    public MensajeError(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void mostrar() {
        System.out.println("¡Error! " + mensaje);
    }
}
