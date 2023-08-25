package com.soflond.crud.aprender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soflond.crud.aprender.models.Categorias;
import com.soflond.crud.aprender.repositories.ICategoriasRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private ICategoriasRepository categoriasRepository;

    public Categorias save(Categorias categoria) {
        return categoriasRepository.save(categoria);
    }

    public List<Categorias> findAllCategorias() {
        return (List<Categorias>) categoriasRepository.findAll();
    }

    public Optional<Categorias> findCategoriaById(Long id) {
        return categoriasRepository.findById(id);
    }

    public void deleteCategoriaById(Long id) {
        categoriasRepository.deleteById(id);
    }

    public Optional<Categorias> findById(int id) {
        return categoriasRepository.findById(id);
    }

}
