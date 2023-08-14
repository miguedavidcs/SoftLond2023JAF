package Abstracto;

public abstract class Empleado {
    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularSalario();
    
}
