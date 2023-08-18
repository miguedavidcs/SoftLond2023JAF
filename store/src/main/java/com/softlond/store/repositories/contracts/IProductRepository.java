package com.softlond.store.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softlond.store.entities.Product;

public interface IProductRepository extends JpaRepository<Product,Long>{
    
}
