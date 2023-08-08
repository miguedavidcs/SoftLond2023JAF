package com.softlond.ejercicios.dos.app;

public class Mensaje {
    public static void mostrarMensajeExitoso(String mensaje) {
        System.out.println("[EXITO] " + mensaje);
    }

    public static void mostrarMensajeError(String mensaje) {
        System.err.println("[ERROR] " + mensaje);
    }
}
