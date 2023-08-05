package com.softlond.clases;



public class Celular extends Producto{
    private String modelo;
    public Celular() {
    }
    public Celular(String nombre, double precio) {
        super(nombre, precio);
    }
    
    public Celular(String nombre, double precio, String modelo) {
        super(nombre, precio);
        this.modelo = modelo;
    }


    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double calcularImpuesto() {
        double iva;
        if(getPrecio()>=20){
             iva = 0.15;
        }else{
             iva = 0.05;
        }

        return getPrecio()+(getPrecio()* iva) ;
        
    }

    @Override
    public String obtenerDetalles() {
    return "Laptop nombre: "+getNombre()+" modelo: "+getModelo()+ " Precio: "+getPrecio();  
    }
    

    
    
}
