package abstracta;

import interfaces.Forma;

public abstract class Geometrica implements Forma {
    private String nombre;

    public Geometrica(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double Area();
}
