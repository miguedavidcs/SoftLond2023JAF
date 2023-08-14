package model;

import abstacts.Animal;
import implementos.Comportamiento;

public class Gato extends Animal implements Comportamiento {

    @Override
    public void hacersonido() {
          System.out.println("el gato miu miu");
    }

    @Override
    public void Correr() {
    System.out.println("Esta Corriendo");     
    }

    @Override
    public void Saltar() {
            System.out.println("Esta Saltando");     

         }

    @Override
    public void Volar() {
            System.out.println("No puede Volar");     

      }
    
    
}
