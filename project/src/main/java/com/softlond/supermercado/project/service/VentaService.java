package com.softlond.supermercado.project.service;

import com.softlond.supermercado.project.model.Cliente;
import com.softlond.supermercado.project.model.Producto;
import com.softlond.supermercado.project.model.Venta;
import com.softlond.supermercado.project.repository.VentaRepository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;
    private final ClienteService clienteService;
    private final ProductoService productoService;
    

    @Autowired
    public VentaService(VentaRepository ventaRepository, ClienteService clienteService,
                        ProductoService productoService, EntityManager entityManager) {
        this.ventaRepository = ventaRepository;
        this.clienteService = clienteService;
        this.productoService = productoService;
        
    }

    @Transactional
    public Venta realizarVenta(Long clienteId, List<Long> productoIds) {
        Cliente cliente = clienteService.obtenerClientePorId(clienteId);
        if (cliente == null) {
            return null;
        }

        List<Producto> productos = productoService.obtenerProductosPorIds(productoIds);
        BigDecimal totalVenta = calcularTotalVenta(productos);

        Venta venta = new Venta();
        venta.setCliente(cliente);
        venta.setProductos(productos);
        venta.setFecha(LocalDate.now());
        venta.setTotal(totalVenta);

        return ventaRepository.save(venta);
    }

    private BigDecimal calcularTotalVenta(List<Producto> productos) {
        BigDecimal total = BigDecimal.ZERO;
        for (Producto producto : productos) {
            total = total.add(producto.getPrecio());
        }
        return total;
    }

    public List<Venta> obtenerTodasLasVentas() {
        return ventaRepository.findAll();
    }

    public Venta obtenerVentaPorId(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
    public List<Venta> obtenerVentasEnRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return ventaRepository.findByFechaBetween(fechaInicio, fechaFin);
    }
}
