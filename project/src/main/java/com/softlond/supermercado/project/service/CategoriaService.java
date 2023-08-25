package com.softlond.supermercado.project.service;

import com.softlond.supermercado.project.model.Categoria;
import com.softlond.supermercado.project.repository.CategoriaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final EntityManager entityManager;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository, EntityManager entityManager) {
        this.categoriaRepository = categoriaRepository;
        this.entityManager = entityManager;
    }

    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria obtenerCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria actualizarCategoria(Long id, Categoria categoria) {
        Categoria categoriaExistente = categoriaRepository.findById(id).orElse(null);
        if (categoriaExistente != null) {
            categoriaExistente.setNombre(categoria.getNombre());
            return categoriaRepository.save(categoriaExistente);
        }
        return null;
    }

    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

    public List<Categoria> buscarCategoriasPorNombre(String nombre) {
        TypedQuery<Categoria> query = entityManager.createQuery(
                "SELECT c FROM Categoria c WHERE c.nombre LIKE :nombre", Categoria.class);
        query.setParameter("nombre", "%" + nombre + "%");
        return query.getResultList();
    }

    public List<Categoria> buscarCategoriasPorDescripcion(String descripcion) {
        TypedQuery<Categoria> query = entityManager.createQuery(
                "SELECT c FROM Categoria c WHERE c.descripcion LIKE :descripcion", Categoria.class);
        query.setParameter("descripcion", "%" + descripcion + "%");
        return query.getResultList();
    }
}
