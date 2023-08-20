package com.soflond.crud.aprender.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soflond.crud.aprender.models.Productos;
import com.soflond.crud.aprender.repositories.IProductoRepository;

@Service
public class ProductoServices {
    @Autowired
    private IProductoRepository productoRepository;

    public Productos save(Productos producto) {
        return productoRepository.save(producto);
    }

    public List<Productos> findAllProductos() {
        return (List<Productos>) productoRepository.findAll();
    }

    public List<Productos> findAllCategorias(int idCategoria) {
        List<Productos> productoRespuesta = new ArrayList<>();
        
        List<Productos> productos = (List<Productos>) productoRepository.findAll();
        
        for (Productos producto : productos) {
            if (producto.getId_categorias() != null && producto.getId_categorias().getId() == idCategoria) {
                productoRespuesta.add(producto);
            }
        }
        
        return productoRespuesta;
    }
    public List<Productos> findAllProvedores(int idProvedor) {
        List<Productos> productoRespuesta = new ArrayList<>();
        
        List<Productos> productos = (List<Productos>) productoRepository.findAll();
        
        for (Productos producto : productos) {
            if (producto.getId_proveedor() != null && producto.getId_proveedor().getId() == idProvedor) {
                productoRespuesta.add(producto);
            }
        }
        
        return productoRespuesta;
    }
    
}
