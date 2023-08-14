import Abstracto.InstrumentoMusical;
import Model.Bateria;
import Model.Guitarra;
import Model.Piano;
import Model.Violin;

public class App {
    public static void main(String[] args) throws Exception {
       InstrumentoMusical[] instrumentos = {
            new Guitarra(),
            new Piano(),
            new Violin(),
            new Bateria()
        };

        hacerTocarInstrumentos(instrumentos);
    }

    public static void hacerTocarInstrumentos(InstrumentoMusical[] instrumentos) {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
            

        }
        
    }
}
