package com.soflond.crud.aprender.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soflond.crud.aprender.models.Proveedor;
import com.soflond.crud.aprender.services.ProveedorService;

@RestController
@RequestMapping("/Proveedor/")
public class ProveedorRest {
    @Autowired
    private ProveedorService proveedorService;
    @GetMapping
    private ResponseEntity<List<Proveedor>> getAllProveedor(){
        return ResponseEntity.ok(proveedorService.findAllProveedor());
    }
    
}
