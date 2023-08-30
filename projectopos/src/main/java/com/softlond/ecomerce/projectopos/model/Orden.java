package com.softlond.ecomerce.projectopos.model;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Orden {
    private Long id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;
    private double Total;
    
    
}
