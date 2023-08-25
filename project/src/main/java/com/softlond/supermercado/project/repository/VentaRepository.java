package com.softlond.supermercado.project.repository;

import com.softlond.supermercado.project.model.Venta;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
        List<Venta> findByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin);

}
