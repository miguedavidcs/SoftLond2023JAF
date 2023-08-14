package model;

import abstacts.Animal;
import implementos.Comportamiento;

public class Perro extends Animal implements Comportamiento{

    @Override
    public void hacersonido() {
       System.out.println("El perro gaugua");
    }

    @Override
    public void Correr() {
       System.out.println("El Perro esta Corriendo");
    }

    @Override
    public void Saltar() {
        System.out.println("El Perro esta Saltando");
    }

    @Override
    public void Volar() {
        System.out.println("El perro no puede volar");
    }
    
}
