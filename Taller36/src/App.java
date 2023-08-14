import abstacts.Animal;
import model.Gato;
import model.Pajaro;
import model.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        Animal paco = new Perro();
        paco.hacersonido();
        Perro Zeus = new Perro();
        Zeus.Volar();
        Zeus.Correr();
        Zeus.Saltar();
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal pajaro = new Pajaro();
        
        hacerSonido(perro);
        hacerSonido(gato);
        hacerSonido(pajaro);

        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Pajaro()
        };
        for (int i = 0; i < animales.length; i++) {
            animales[i].hacersonido();
        }

        
    }

    private static void hacerSonido(Animal animal) {
        animal.hacersonido();
    }
    
}
