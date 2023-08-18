package com.soflond.crud.aprender.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soflond.crud.aprender.models.Productos;
import com.soflond.crud.aprender.services.ProductoServices;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/Productos")
public class ProductoRest {
    @Autowired
    private ProductoServices productoServices;
    @GetMapping
    private ResponseEntity<List<Productos>> getAllProdructo(){
        return ResponseEntity.ok(productoServices.findAllProductos());
    } 
    
    
}
