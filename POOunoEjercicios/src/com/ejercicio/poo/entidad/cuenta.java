package com.ejercicio.poo.entidad;

import java.math.BigDecimal;

public class cuenta {
    private int id;
    private String nombre;
    private String nCuenta;
    private String tInteres;
    private BigDecimal saldo;

    public cuenta() {}

    public cuenta(int id, String nombre, String nCuenta, String tInteres, BigDecimal saldo) {
        this.id = id;
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.tInteres = tInteres;
        this.saldo = saldo;
    }

    // Getters and Setters for all attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String gettInteres() {
        return tInteres;
    }

    public void settInteres(String tInteres) {
        this.tInteres = tInteres;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
