package Model;

import Abstracto.InstrumentoMusical;

public class Bateria extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("La batería suena: BUM BUM TSS");
    }
}
