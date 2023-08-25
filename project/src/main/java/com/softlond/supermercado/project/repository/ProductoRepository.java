package com.softlond.supermercado.project.repository;

import com.softlond.supermercado.project.model.Producto;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContaining(String nombre);
    List<Producto> findByPrecioBetween(BigDecimal precioMin, BigDecimal precioMax);

}
