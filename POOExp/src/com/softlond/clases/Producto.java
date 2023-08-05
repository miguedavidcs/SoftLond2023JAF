package com.softlond.clases;


// clase objeto
public abstract class Producto {
    // aplicando abstraccion
    private String nombre;
    private double precio;

    // Constructor de la clase por depecto
    public Producto() {
    }

    // Constructor que metrae todo
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public abstract double calcularImpuesto();
    public abstract String obtenerDetalles();


    
}
