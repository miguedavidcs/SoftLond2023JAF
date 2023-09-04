package com.softlond.ecomerce.projectopos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softlond.ecomerce.projectopos.mensaje.KonstanteMensaje;
import com.softlond.ecomerce.projectopos.mensaje.Mensaje;
import com.softlond.ecomerce.projectopos.model.Producto;
import com.softlond.ecomerce.projectopos.repository.ProductoRepositoryDAO;
import com.softlond.ecomerce.projectopos.service.implementacion.ProductoServiceImpl;

@Service
public class ProductosService implements ProductoServiceImpl {
    @Autowired
    ProductoRepositoryDAO productoRepositoryDAO;

    @Override
    public Producto save(Producto producto) {
        Optional<Producto> productoExistente = productoRepositoryDAO.findByNombreAndId(producto.getNombre(), producto.getId());
    
        if (productoExistente.isPresent()) {
            String mensaje = KonstanteMensaje.PRODUCTO_EXISTENTE;
            Mensaje.mostrarError(mensaje);
            // Si deseas lanzar una excepción, podrías hacer algo como esto:
            throw new RuntimeException(mensaje);
            // O simplemente puedes devolver null u otro valor especial en este caso.
        } else {
            return productoRepositoryDAO.save(producto);
        }
    }
    


    @Override
    public Optional<Producto> mostrar(Long id) {
        return productoRepositoryDAO.findById(id);
    }

    @Override
    public void actualizar(Producto producto) {
        // Obtener el producto existente de la base de datos
        productoRepositoryDAO.findById(producto.getId())
        // Verificar si el producto existe en la base de datos
         .ifPresent(x ->{
            x.setNombre(producto.getNombre());
            x.setPrecio(producto.getPrecio());
            x.setCantidad(producto.getCantidad());
            x.setDescripcion(producto.getDescripcion());
            x.setImagen(producto.getImagen());
            // Actualizar otros campos si es necesario
            productoRepositoryDAO.save(x);
         });
           
    }

    @Override
    public void delete(Long id) {
        productoRepositoryDAO.findById(id)
            .ifPresent(x-> productoRepositoryDAO.delete(x));
      }

}
