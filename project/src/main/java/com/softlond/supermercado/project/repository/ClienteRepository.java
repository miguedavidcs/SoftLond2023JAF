package com.softlond.supermercado.project.repository;

import com.softlond.supermercado.project.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
