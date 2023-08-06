package com.softlond.ejercicios.uno.excepcion;

public class Mensajes {
    private String mensaje;

    public Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean esExitoso() {
        return mensaje != null;
    }

    public String getMensaje() {
        return mensaje;
    }
}
