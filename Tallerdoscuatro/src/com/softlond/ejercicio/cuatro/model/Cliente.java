package com.softlond.ejercicio.cuatro.model;

public class Cliente {
    private String nombreEmpresa;
    private String nombrePersona;
    private String cedula;

    public Cliente(String nombreEmpresa, String nombrePersona, String cedula) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombrePersona = nombrePersona;
        this.cedula = cedula;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getCedula() {
        return cedula;
    }
}

     
    

