package Model;

import Abstracto.InstrumentoMusical;
import Interfaces.Cuerdas;

public class Violin extends InstrumentoMusical implements Cuerdas{

    @Override
    public void tocar() {
        System.out.println("Se esta tocando violin");
    }

    @Override
    public void tieneCuerdas() {
        System.out.println("Tiene 4 Cuerdas");
   }
    
    
}
