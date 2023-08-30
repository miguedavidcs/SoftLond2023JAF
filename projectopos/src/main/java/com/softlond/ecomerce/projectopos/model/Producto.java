package com.softlond.ecomerce.projectopos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int Cantidad;
    
}
