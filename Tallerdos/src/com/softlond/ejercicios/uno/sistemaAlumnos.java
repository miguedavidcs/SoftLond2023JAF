package com.softlond.ejercicios.uno;

import java.util.ArrayList;

import com.softlond.ejercicios.uno.excepcion.Mensajes;


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
     public void asignarCalificacion(String nombre, double calificacion) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                Mensajes mensaje = alumno.agregarCalificacion(calificacion);
                if (mensaje.esExitoso()) {
                    System.out.println("Exito: " + mensaje.getMensaje());
                } else {
                    System.out.println("Error: " + mensaje.getMensaje());
                }
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
