package com.softlond.ejercicios.uno;

import java.util.ArrayList;

import com.softlond.ejercicios.uno.excepcion.Mensajes;

public class Alumno {
    private String nombre;
    private int edad;
    private ArrayList<Double> calificaciones;
     private static final double maxima=5.0;
     private static final double minimo=0.0;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Mensajes agregarCalificacion(double calificacion) {
        if (calificacion <= maxima && calificacion > minimo) {
            calificaciones.add(calificacion);
            return new Mensajes("Calificación agregada con éxito");
        } else {
            return new Mensajes("Ingresar por favor notas no superiores a 5.0");
        }
        
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }
        double sumatoria = 0;
        for (double calificacion : calificaciones) {
            sumatoria += calificacion;
        }
        double redondeo =sumatoria/calificaciones.size();
        return redondeo;
    }
    public String respuesta(double redondeo){
        if(redondeo>=3.15){
            return ("Felicitaciones");
        }
        else{
            return "Uy papa repite semestre";
        }
        
        
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificaciones: " + calificaciones);
        System.out.println("Promedio: " + calcularPromedio() + "\n");
        double r= calcularPromedio();
        System.out.println(" "+respuesta(r));
        
    }

}
