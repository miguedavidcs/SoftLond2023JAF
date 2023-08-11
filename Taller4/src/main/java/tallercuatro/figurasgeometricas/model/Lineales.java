package main.java.tallercuatro.figurasgeometricas.model;

public  class Lineales {    
    private double puntoXi;
    private double puntoXF;
    private double puntoYi; 
    private double puntoYF;   
    
    public Lineales(double puntoXi, double puntoXF, double puntoYi, double puntoYF) {
        this.puntoXi = puntoXi;
        this.puntoXF = puntoXF;
        this.puntoYi = puntoYi;
        this.puntoYF = puntoYF;
    }
    
    public double calcularDistancia() {
        double distanciaX = puntoXF - puntoXi;
        double distanciaY = puntoYF - puntoYi;

        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
}
