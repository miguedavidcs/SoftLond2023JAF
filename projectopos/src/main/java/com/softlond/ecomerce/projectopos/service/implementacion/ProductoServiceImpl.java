package com.softlond.ecomerce.projectopos.service.implementacion;

import java.util.Optional;

import com.softlond.ecomerce.projectopos.model.Producto;

public interface ProductoServiceImpl {
    public Producto save(Producto producto);
    public Optional<Producto> mostrar(Long id);
    public void actualizar (Producto producto);
    public void delete (Long id);
    
}
