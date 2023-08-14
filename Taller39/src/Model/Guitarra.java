package Model;

import Abstracto.InstrumentoMusical;
import Interfaces.Cuerdas;

public class Guitarra extends InstrumentoMusical implements Cuerdas{

    @Override
    public void tocar() {
        System.out.println("Tocando Guitarra");
    }

    @Override
    public void tieneCuerdas() {
    System.out.println("Tiene 7 Cuerdas");   
    }
    
}
