package Model;

import Abstracto.Empleado;

public class Asalariado extends Empleado{

    private double salarioMensual;
    public Asalariado(String nombre,double salarioMensual) {
        super(nombre);
        this.salarioMensual=salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
           }
    
}
