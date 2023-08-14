package Model;

import Interfaces.Dibujable;

public class Lienzo{
private Dibujable[] elementos;

    public Lienzo(Dibujable[] elementos) {
        if (elementos == null || elementos.length == 0) {
            throw new IllegalArgumentException("El lienzo debe tener al menos un elemento");
        }
        this.elementos = elementos;
    }

    public void dibujarElementos() {
        for (Dibujable elemento : elementos) {
            try {
                elemento.dibujar();
            } catch (Exception e) {
                System.out.println("Error al dibujar un elemento: " + e.getMessage());
            }
        }
    }
}
