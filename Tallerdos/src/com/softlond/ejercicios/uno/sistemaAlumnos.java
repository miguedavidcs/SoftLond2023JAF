package com.softlond.ejercicios.uno;

import java.util.ArrayList;

public class sistemaAlumnos  {
    private ArrayList <Alumno> alumnos;
     public sistemaAlumnos(){
        alumnos = new ArrayList<>();
     }
     
     //insert
     public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
     }
     //selest y insert multiple de un parametro
     public void asignarCalificacion(String nombre ,double Calificacion){
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equals(nombre)){
                if(Calificacion>5.0){
                    System.out.println("Ingresar por favor notas no superior a 5.0");
                }
                alumno.agregarCalificacion(Calificacion);;
                break;
            }            
        }
    }
        //Mostar la actulizacion
    public void mostrarDetallesAlumnos(){
        for (Alumno alumno : alumnos) {
            alumno.mostrarInformacion();
        }
    
     }
    
    
}
