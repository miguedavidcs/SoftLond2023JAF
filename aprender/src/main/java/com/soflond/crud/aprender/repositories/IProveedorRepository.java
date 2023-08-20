package com.soflond.crud.aprender.repositories;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.soflond.crud.aprender.models.Proveedor;

public interface IProveedorRepository extends CrudRepository<Proveedor,Long>{

    Optional<Proveedor> findById(int id);
    
}
