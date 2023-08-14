import Interfaces.Dibujable;
import Model.Ciirculo;
import Model.Lienzo;
import Model.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
       Dibujable[] elementos = {
            new Ciirculo(),
            new Rectangulo()
        };

        try {
            Lienzo lienzo = new Lienzo(elementos);
            lienzo.dibujarElementos();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el lienzo: " + e.getMessage());
        }
    }
}
