package com.soflond.crud.aprender.repositories;


import org.springframework.data.repository.CrudRepository;

import com.soflond.crud.aprender.models.Productos;

public interface IProductoRepository extends CrudRepository<Productos,Long>{
    
    
}
