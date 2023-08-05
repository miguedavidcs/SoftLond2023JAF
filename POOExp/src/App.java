import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.softlond.clases.Celular;
import com.softlond.clases.Laptop;
import com.softlond.clases.Producto;
import com.softlond.clases.Venta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner respuesta = new Scanner(System.in);

        List<Producto> productos = new ArrayList<>();
        productos.add(new Laptop("Laptop 1", 1000.0, "Brand 1", "Processor 1"));
        productos.add(new Laptop("Laptop 2", 1200.0, "Brand 2", "Processor 2"));
        productos.add(new Celular("Cellular 1", 600.0, "Model A"));
        productos.add(new Celular("Cellular 2", 800.0, "Model B"));

        System.out.println("¿Quieres ver la lista de productos disponibles? (S/N)");
        String respuestaUsuario = respuesta.nextLine();

        if (respuestaUsuario.equalsIgnoreCase("S")) {
            System.out.println("Esta es la lista de productos:");
            for (Producto producto : productos) {
                System.out.println(producto.obtenerDetalles());
                System.out.println("------------------------");
            }
        }

        
        System.out.println("¿ Que deseas comprar? Nombre");
        String nameP = respuesta.nextLine();
        System.out.println("¿ Que deseas comprar? Cantidad");
        String numberP = respuesta.nextLine();

        // Convertir la cantidad ingresada a un número (doble)
        double cantidad = Double.parseDouble(numberP);

        // Buscar el producto deseado en la lista
        Producto productoDeseado = null;
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nameP)) {
                productoDeseado = producto;
                break;
            }
        }

        if (productoDeseado != null) {
            // Crear la instancia de Venta con el producto deseado y la cantidad
            Venta vender = new Venta(productoDeseado, cantidad);

            // Mostrar el resultado de la venta
            double totalVenta = vender.calcularTotal();
            System.out.println("Total de la venta: $" + totalVenta);
        } else {
            System.out.println("El producto ingresado no está disponible en la lista.");
        }

        respuesta.close();
    }
}
