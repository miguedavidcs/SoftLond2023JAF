package main.java.tallercuatro.figurasgeometricas.submodel;

import main.java.tallercuatro.figurasgeometricas.model.interfaces.Planos;

public class Cuadrado implements Planos {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
