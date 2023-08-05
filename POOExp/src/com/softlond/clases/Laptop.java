package com.softlond.clases;



public class Laptop extends Producto{
    private String marca;
    private String tProceador;
    public Laptop(){
        
    }

    public Laptop(String nombre, double precio, String marca, String tProceador) {
        super(nombre, precio);
        this.marca = marca;
        this.tProceador = tProceador;
    }
    public Laptop(String marca, String tProceador) {
        this.marca = marca;
        this.tProceador = tProceador;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String gettProceador() {
        return tProceador;
    }
    public void settProceador(String tProceador) {
        this.tProceador = tProceador;
    }

    @Override
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
    return "Laptop nombre: "+getNombre()+" marca: "+getMarca()+ " Precio: "+getPrecio();  
    }
    
    
    
}
