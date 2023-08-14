package model;

import interfaces.Productos;

public class ProductoEspecifico implements Productos {
    private String nombre;
    private double precio;

    public ProductoEspecifico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}