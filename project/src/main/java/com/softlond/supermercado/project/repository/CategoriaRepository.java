package com.softlond.supermercado.project.repository;

import com.softlond.supermercado.project.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
   
}
