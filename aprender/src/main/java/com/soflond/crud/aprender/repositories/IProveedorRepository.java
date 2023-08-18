package com.soflond.crud.aprender.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soflond.crud.aprender.models.Proveedor;

public interface IProveedorRepository extends CrudRepository<Proveedor,Long>{
    public List<Proveedor> findAllProveedor();
}
