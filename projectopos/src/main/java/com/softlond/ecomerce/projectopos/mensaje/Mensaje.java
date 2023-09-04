package com.softlond.ecomerce.projectopos.mensaje;

public class Mensaje extends RuntimeException{
    public static void mostrarError(Object mensaje) {
        if (mensaje instanceof String) {
            System.err.println("Error: " + mensaje);
        } else if (mensaje instanceof Exception) {
            Exception excepcion = (Exception) mensaje;
            excepcion.printStackTrace(System.err);
        } else {
            System.err.println("Error desconocido.");
        }
    }
    
}
