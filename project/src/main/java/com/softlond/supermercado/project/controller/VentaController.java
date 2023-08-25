package com.softlond.supermercado.project.controller;

import com.softlond.supermercado.project.model.Venta;
import com.softlond.supermercado.project.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    @Autowired
    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping("/realizar")
    public Venta realizarVenta(@RequestParam Long clienteId, @RequestParam List<Long> productoIds) {
        return ventaService.realizarVenta(clienteId, productoIds);
    }

    @GetMapping("/listar")
    public List<Venta> obtenerTodasLasVentas() {
        return ventaService.obtenerTodasLasVentas();
    }

    @GetMapping("/{id}")
    public Venta obtenerVentaPorId(@PathVariable Long id) {
        return ventaService.obtenerVentaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarVenta(@PathVariable Long id) {
        ventaService.eliminarVenta(id);
    }
    @GetMapping("/rango-fechas")
    public ResponseEntity<List<Venta>> obtenerVentasEnRangoFechas(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaInicio,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaFin) {

        List<Venta> ventasEnRango = ventaService.obtenerVentasEnRangoFechas(fechaInicio, fechaFin);

        return ResponseEntity.ok(ventasEnRango);
    }
}
