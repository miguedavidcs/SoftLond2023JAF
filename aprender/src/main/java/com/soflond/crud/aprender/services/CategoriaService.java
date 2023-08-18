package com.soflond.crud.aprender.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soflond.crud.aprender.models.Categorias;
import com.soflond.crud.aprender.repositories.ICategoriasRepository;

@Service
public class CategoriaService implements ICategoriasRepository{
    @Autowired
    private ICategoriasRepository categoriasRepository;

    @Override
    public <S extends Categorias> S save(S entity) {
        return categoriasRepository.save(entity);
    }

    @Override
    public <S extends Categorias> Iterable<S> saveAll(Iterable<S> entities) {
        return categoriasRepository.saveAll(entities);
    }

    @Override
    public Optional<Categorias> findById(Long id) {
        return categoriasRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
       return false;
    }

    @Override
    public Iterable<Categorias> findAll() {
        return categoriasRepository.findAll();
    }

    @Override
    public Iterable<Categorias> findAllById(Iterable<Long> ids) {
        return categoriasRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        categoriasRepository.deleteById(id);
    }

    @Override
    public void delete(Categorias entity) {
        categoriasRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        categoriasRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends Categorias> entities) {
       categoriasRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
       categoriasRepository.deleteAll();
    }
    public List<Categorias> findAllCategorias() {
       return (List<Categorias>) categoriasRepository.findAll();
    }

    
}
