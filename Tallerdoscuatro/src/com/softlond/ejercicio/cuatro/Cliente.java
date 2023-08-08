package com.softlond.ejercicio.cuatro;



public class Cliente  {
    private int id =0;
    private int celula; 
    private String nombre;
    private int edad;
    private int telefono;  
    
   

    public Cliente( int celula, String nombre, int edad, int telefono) {
        this.id = id++;
        this.celula = celula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCelula() {
        return celula;
    }

    public void setCelula(int celula) {
        this.celula = celula;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   
   

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", celula=" + celula + ", nombre=" + nombre + ", edad=" + edad + ", telefono="
                + telefono + "]";
    }
     
    
}
