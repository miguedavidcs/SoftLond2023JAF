package model;

import abstacts.Animal;
import implementos.Comportamiento;

public class Pajaro extends Animal implements Comportamiento {

    @Override
    public void hacersonido(){
        System.out.println("Canta");
    }

    @Override
    public void Correr() {
        System.out.println("Los pajaros pueden correr despacio");
    }

    @Override
    public void Saltar() {
        System.out.println("Pajaros pueden Saltar");
    }

    @Override
    public void Volar() {
        System.out.println("Los pajaros pueden Volar");
    }
    
    
}
