import abstracta.Geometrica;
import model.Circulo;
import model.Cuadrado;

public class App {
    public static void main(String[] args) throws Exception {
       try {
            Geometrica[] formas = {
                new Circulo("Círculo ", 65),
                new Cuadrado("Cuadrado ", 144, 60)
            };

            for (Geometrica forma : formas) {
                double area = forma.Area();
                System.out.println("Área de " + forma.getNombre() + ": " + area);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
