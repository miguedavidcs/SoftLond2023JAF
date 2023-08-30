package com.softlond.ecomerce.projectopos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Usuario {
    private Long id;
    private String nombre;
    private String username;
    private String email;
    private String password;
    private String direccion;
    private String telefono;
    private String tipo; 

}
