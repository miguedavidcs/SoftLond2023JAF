package com.softlond.ecomerce.projectopos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.softlond.ecomerce.projectopos.model.Producto;

public interface ProductoRepositoryDAO extends JpaRepository<Producto,Long> {
    Optional<Producto> findByNombreAndId(String nombre, Long id);
}
