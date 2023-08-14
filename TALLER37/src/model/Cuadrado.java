package model;

import abstracta.Geometrica;

public class Cuadrado extends Geometrica {
    private double base;
    private double altura;

    public Cuadrado(String nombre, double base, double altura) {
        super(nombre);
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser valores positivos");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Area() {
        return base * altura;
    }
}