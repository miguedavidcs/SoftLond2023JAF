package com.soflond.crud.aprender.rest;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soflond.crud.aprender.models.Categorias;
import com.soflond.crud.aprender.services.CategoriaService;

@RestController
@RequestMapping("/Categoria/")
public class CategoriasRest {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    private ResponseEntity<List<Categorias>> getAllCategorias(){
        return ResponseEntity.ok(categoriaService.findAllCategorias());
    }
}
