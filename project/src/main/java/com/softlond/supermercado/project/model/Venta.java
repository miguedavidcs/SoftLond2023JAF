package com.softlond.supermercado.project.model;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softlond.supermercado.project.model.constantes.FechaConstante;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "venta")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @JsonIgnoreProperties("ventas")
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name = "venta_producto",joinColumns = @JoinColumn(name = "id_venta"),inverseJoinColumns = @JoinColumn(name = "id_producto"))
    @JsonIgnoreProperties("ventas")
    private List<Producto> productos;

    @Column(name = "fecha")
    @DateTimeFormat(pattern = FechaConstante.PATRON_FECHA)
    private LocalDate fecha;

    @Column(name = "total")
    private BigDecimal total;

   
}

