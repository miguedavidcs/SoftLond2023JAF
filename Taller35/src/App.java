import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstracts.CategoriaProducto;
import model.Electronica;
import model.Libro;
import model.ProductoEspecifico;
import model.Ropa;

public class App {
    public static void main(String[] args) throws Exception {
        
       
        try (Scanner scanner = new Scanner(System.in)) {
            List<CategoriaProducto> categorias = new ArrayList<>();
            categorias.add(new Electronica());
            categorias.add(new Ropa());
            categorias.add(new Libro());

            System.out.println("Categorías disponibles:");
            for (int i = 0; i < categorias.size(); i++) {
                System.out.println((i + 1) + ". " + categorias.get(i).nombreCategoria);
            }

            System.out.print("Seleccione la categoría (1-" + categorias.size() + "): ");
            int categoriaSeleccionada = scanner.nextInt();
            scanner.nextLine(); // Limpieza del buffer

            if (categoriaSeleccionada < 1 || categoriaSeleccionada > categorias.size()) {
                System.out.println("Selección de categoría inválida.");
                return;
            }

            CategoriaProducto categoriaElegida = categorias.get(categoriaSeleccionada - 1);

            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = scanner.nextDouble();
            scanner.nextLine(); // Limpieza del buffer

            ProductoEspecifico producto = new ProductoEspecifico(nombreProducto, precioProducto);
            
            // Agregar el producto a la categoría elegida usando un switch
            switch (categoriaSeleccionada) {
                case 1:
                    ((Electronica) categoriaElegida).agregarProducto(producto);
                    break;
                case 2:
                    ((Ropa) categoriaElegida).agregarProducto(producto);
                    break;
                case 3:
                    ((Libro) categoriaElegida).agregarProducto(producto);
                    break;
            }
            
            mostrarProductosEnCategoria(categoriaElegida);
        }
    }

    private static void mostrarProductosEnCategoria(CategoriaProducto categoria) {
        categoria.mostrarCategoria();
        System.out.println("Productos:");
        
        if (categoria instanceof Electronica) {
            for (ProductoEspecifico producto : ((Electronica) categoria).getProductos()) {
                producto.mostrarDetalles();
            }
        } else if (categoria instanceof Ropa) {
            for (ProductoEspecifico producto : ((Ropa) categoria).getProductos()) {
                producto.mostrarDetalles();
            }
        } else if (categoria instanceof Libro) {
            for (ProductoEspecifico producto : ((Libro) categoria).getProductos()) {
                producto.mostrarDetalles();
            }
        }
        
        System.out.println();
    }
}