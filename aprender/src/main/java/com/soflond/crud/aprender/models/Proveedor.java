package com.soflond.crud.aprender.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dirrecion")
    private String dirreccion;
    public Proveedor() {
        //*constructor vacio */
    }
    
    public Proveedor(String nombre, String dirreccion) {
        super();
        this.nombre = nombre;
        this.dirreccion = dirreccion;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDirreccion() {
        return dirreccion;
    }
    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }
    
    
}
