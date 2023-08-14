package Model;

import Abstracto.InstrumentoMusical;
import Interfaces.Cuerdas;

public class Piano extends InstrumentoMusical implements Cuerdas{

    @Override
    public void tocar() {
        System.out.println("El piano se esta Tocando");
  }

    @Override
    public void tieneCuerdas() {
        System.out.println("Tiene 230 cuerdas");
    }
    
}
