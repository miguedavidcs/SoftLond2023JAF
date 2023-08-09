package com.softlond.conversor;

import java.util.HashMap;
import java.util.Map;

public class ConversorMoneda {
    private Map<String, Double> tasasDeConversion;

    public ConversorMoneda() {
        tasasDeConversion = new HashMap<>();
        tasasDeConversion.put("USD", 1.0);
        tasasDeConversion.put("EUR", 0.85);
        tasasDeConversion.put("GBP", 0.73);
        tasasDeConversion.put("JPY", 110.21);
    }

    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        double tasaOrigen = tasasDeConversion.get(monedaOrigen);
        double tasaDestino = tasasDeConversion.get(monedaDestino);
        return FormalaConversion.convertir(cantidad, tasaOrigen, tasaDestino);
    }
}