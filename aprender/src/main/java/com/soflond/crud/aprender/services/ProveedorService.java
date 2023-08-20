package com.soflond.crud.aprender.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soflond.crud.aprender.models.Proveedor;
import com.soflond.crud.aprender.repositories.IProveedorRepository;

@Service
public class ProveedorService {
    @Autowired
    private IProveedorRepository proveedorRepository;

    public List<Proveedor> findAllProveedor() {
        return (List<Proveedor>) proveedorRepository.findAll();
    }

    public Optional<Proveedor> findById(int id) {
        return proveedorRepository.findById(id);
    }

    public Proveedor saveProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void deleteProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }
    
}
