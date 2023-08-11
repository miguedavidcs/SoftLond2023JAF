package main.java.tallercuatro.figurasgeometricas.submodel;

import main.java.tallercuatro.figurasgeometricas.model.interfaces.Planos;

public class Circulo implements Planos {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Getter para el radio
    public double getRadio() {
        return radio;
    }

    // Setter para el radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
