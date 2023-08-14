package model;

import java.util.ArrayList;
import java.util.List;

import abstracts.CategoriaProducto;

public class Libro extends CategoriaProducto {
    private List<ProductoEspecifico> productos = new ArrayList<>();
    public Libro(){
        nombreCategoria ="Libro";
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoria: "+nombreCategoria);
    }
     public void agregarProducto(ProductoEspecifico producto){
        productos.add(producto);
     }
     public List<ProductoEspecifico> getProductos(){
        return productos;
     }
}