package com.soflond.crud.aprender.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categorias id_categorias;

    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedor id_proveedor;
      

    public Productos() {
        //*costructor vacio */
    }
    

    public Productos(int id,String nombre, BigDecimal precio, Categorias id_categorias, Proveedor id_proveedor) {
        super();
        this.id=id;
        this.nombre = nombre;
        this.precio = precio;
        this.id_categorias = id_categorias;
        this.id_proveedor = id_proveedor;
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Categorias getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Categorias id_categorias) {
        this.id_categorias = id_categorias;
    }

    public Proveedor getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedor id_provedor) {
        this.id_proveedor = id_provedor;
    }


    @Override
    public String toString() {
        return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", id_categorias=" + id_categorias
                + ", id_proveedor=" + id_proveedor + "]";
    }
    
}
