package com.soflond.crud.aprender.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soflond.crud.aprender.models.Proveedor;
import com.soflond.crud.aprender.repositories.IProveedorRepository;



@Service
public class ProveedorService implements IProveedorRepository{
    @Autowired
    private IProveedorRepository proveedorRepository;

    @Override
    public <S extends Proveedor> S save(S entity) {
        return proveedorRepository.save(entity);
    }

    @Override
    public <S extends Proveedor> Iterable<S> saveAll(Iterable<S> entities) {
        return proveedorRepository.saveAll(entities);
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
      return proveedorRepository.existsById(id);
        
    }

    @Override
    public Iterable<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public Iterable<Proveedor> findAllById(Iterable<Long> ids) {
        return proveedorRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        proveedorRepository.deleteById(id);
    }

    @Override
    public void delete(Proveedor entity) {
        proveedorRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        proveedorRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends Proveedor> entities) {
        proveedorRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        proveedorRepository.deleteAll();
    }
    public List<Proveedor> findAllProveedor() {
       return (List<Proveedor>) proveedorRepository.findAll();
    }

    
}
