package Model;

import Abstracto.Empleado;

public class Independiente extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;
    
    public Independiente(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {

       return salarioPorHora *horasTrabajadas;
    }

}
