package com.soflond.crud.aprender.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.soflond.crud.aprender.models.Categorias;

public interface ICategoriasRepository extends CrudRepository<Categorias,Long>{

    Optional<Categorias> findById(int id);
    
}
