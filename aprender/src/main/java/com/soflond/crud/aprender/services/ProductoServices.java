package com.soflond.crud.aprender.services;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soflond.crud.aprender.models.Productos;
import com.soflond.crud.aprender.repositories.IProductoRepository;

@Service
public class ProductoServices implements IProductoRepository{
    @Autowired
    private IProductoRepository productoRepositoy;

    @Override
    public <S extends Productos> S save(S entity) {
        return productoRepositoy.save(entity);
    }

    @Override
    public <S extends Productos> Iterable<S> saveAll(Iterable<S> entities) {
        return productoRepositoy.saveAll(entities);
    }

    @Override
    public Optional<Productos> findById(Long id) {
        return productoRepositoy.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Iterable<Productos> findAll() {
        return productoRepositoy.findAll();
    }

    @Override
    public Iterable<Productos> findAllById(Iterable<Long> ids) {
        return productoRepositoy.findAllById(ids);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        productoRepositoy.deleteById(id);
    }

    @Override
    public void delete(Productos entity) {
        productoRepositoy.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        productoRepositoy.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends Productos> entities) {
        productoRepositoy.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        productoRepositoy.deleteAll();
    }
    public List<Productos> findAllProductos(){
        return (List<Productos>) productoRepositoy.findAll();

    }

    

    
    
}
