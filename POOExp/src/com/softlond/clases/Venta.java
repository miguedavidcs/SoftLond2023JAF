package com.softlond.clases;



public class Venta {
    private Producto producto;
    private double cantidad;

    public Venta( Producto producto, double cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public double calcularTotal(){
        return producto.getPrecio()*cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    

    
    
}
