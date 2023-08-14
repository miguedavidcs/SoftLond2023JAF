package model;

import java.util.ArrayList;
import java.util.List;

import abstracts.CategoriaProducto;

public class Electronica extends CategoriaProducto {
     private List<ProductoEspecifico> productos = new ArrayList<>();

    public Electronica() {
        nombreCategoria = "Electrónica";
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoría: " + nombreCategoria);
    }

    public void agregarProducto(ProductoEspecifico producto) {
        productos.add(producto);
    }

    public List<ProductoEspecifico> getProductos() {
        return productos;
    }

}
