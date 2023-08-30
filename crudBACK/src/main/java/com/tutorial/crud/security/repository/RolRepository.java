package com.tutorial.crud.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;

public interface RolRepository  extends JpaRepository{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
