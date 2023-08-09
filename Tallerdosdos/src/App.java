import java.util.Scanner;

import com.softlond.conversor.ConversorMoneda;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();

        System.out.print("Moneda de origen (USD, EUR, GBP, JPY): ");
        String monedaOrigen = scanner.nextLine().toUpperCase();

        System.out.print("Cantidad: ");
        double cantidad = scanner.nextDouble();

        System.out.print("Moneda de destino (USD, EUR, GBP, JPY): ");
        String monedaDestino = scanner.next().toUpperCase();

        double cantidadConvertida = conversor.convertir(cantidad, monedaOrigen, monedaDestino);
        System.out.printf("%.2f %s equivale a %.2f %s%n", cantidad, monedaOrigen, cantidadConvertida, monedaDestino);

        scanner.close();
    }
}
