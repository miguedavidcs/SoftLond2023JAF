package model;

import abstracta.Geometrica;

public class Circulo extends Geometrica {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser un valor positivo");
        }
        this.radio = radio;
    }

    @Override
    public double Area() {
        return Math.PI * radio * radio;
    }   
}