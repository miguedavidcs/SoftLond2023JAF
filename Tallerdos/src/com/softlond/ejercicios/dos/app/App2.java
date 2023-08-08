package com.softlond.ejercicios.dos.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.softlond.ejercicios.dos.conversor.ConversorMoneda;
import com.softlond.ejercicios.dos.conversor.enumerador.MonedaEnum;


public class App2 {
    public static void App2(String[] args) {
        Map<String, Double> tasasCambio = new HashMap<>();
        tasasCambio.put("USD_TO_EUR", 0.85);
        tasasCambio.put("USD_TO_PESO", 20.0);
        tasasCambio.put("EUR_TO_PESO", 23.5);

        ConversorMoneda conversor = new ConversorMoneda(tasasCambio);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor de Monedas");

        System.out.print("Ingresa la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();

        System.out.print("Ingresa la moneda de origen (USD, EUR, PESO): ");
        String monedaOrigenStr = scanner.next();
        MonedaEnum monedaOrigen = MonedaEnum.valueOf(monedaOrigenStr.toUpperCase());

        System.out.print("Ingresa la moneda de destino (USD, EUR, PESO): ");
        String monedaDestinoStr = scanner.next();
        MonedaEnum monedaDestino = MonedaEnum.valueOf(monedaDestinoStr.toUpperCase());

        try {
            double resultado = conversor.convertir(cantidad, monedaOrigen, monedaDestino);
            Mensaje.mostrarMensajeExitoso(cantidad + " " + monedaOrigen + " son " + resultado + " " + monedaDestino);
        } catch (IllegalArgumentException e) {
            Mensaje.mostrarMensajeError("Error: " + e.getMessage());
        }
    }
    
}
