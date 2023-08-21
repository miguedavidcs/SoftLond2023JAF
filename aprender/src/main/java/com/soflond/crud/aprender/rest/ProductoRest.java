package com.soflond.crud.aprender.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soflond.crud.aprender.models.Categorias;
import com.soflond.crud.aprender.models.Productos;
import com.soflond.crud.aprender.models.Proveedor;
import com.soflond.crud.aprender.services.ProductoServices;
import com.soflond.crud.aprender.services.ProveedorService;
import com.soflond.crud.aprender.services.CategoriaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Productos/")
public class ProductoRest {
    @Autowired
    private ProductoServices productoServices;

    @Autowired
    private ProveedorService proveedorService; // Usar el servicio en lugar del repositorio

    @Autowired
    private CategoriaService categoriaService; // Usar el servicio en lugar del repositorio

    @GetMapping
    public ResponseEntity<List<Productos>> getAllProducto() {
        return ResponseEntity.ok(productoServices.findAllProductos());
    }

    @GetMapping("categorias/{id}")
    public ResponseEntity<List<Productos>> getAllProductoByCategorias(@PathVariable("id") int idCategoria) {
        return ResponseEntity.ok(productoServices.findAllCategorias(idCategoria));
    }

    @GetMapping("proveedor/{id}")
    public ResponseEntity<List<Productos>> getAllProductoByProveedor(@PathVariable("id") int idProveedor) {
        return ResponseEntity.ok(productoServices.findAllProvedores(idProveedor));
    }

    @PostMapping
    public ResponseEntity<Productos> saveProducto(@RequestBody Productos productos) {
        try {
            System.out.println("Received JSON: " + productos.toString());

            Optional<Proveedor> proveedorOptional = proveedorService.findById(productos.getId_proveedor().getId());
            Optional<Categorias> categoriaOptional = categoriaService.findById(productos.getId_categorias().getId());

            if (proveedorOptional.isPresent() && categoriaOptional.isPresent()) {
                productos.setId_proveedor(proveedorOptional.get());
                productos.setId_categorias(categoriaOptional.get());

                Productos productoGuardado = productoServices.save(productos);
                return ResponseEntity.created(new URI("/Productos/" + productoGuardado.getId()))
                        .body(productoGuardado);
            } else {
                return ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Boolean> deleteProducto(@PathVariable("id") Long id) {
        productoServices.deleteById(id);

        boolean productoExists = productoServices.findById(id) != null;

        return ResponseEntity.ok(!productoExists);
    }

}
