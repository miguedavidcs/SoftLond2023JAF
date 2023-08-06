package com.softlond.ejercicios.dos.conversor;

import java.util.Map;

import com.softlond.ejercicios.dos.conversor.enumerador.MonedaEnum;

public class ConversorMoneda {
    private Map<String,Double> tasasCambio;

    public ConversorMoneda(Map<String, Double> tasasCambio) {
        this.tasasCambio = tasasCambio;
    }
    public double convertir(double cantidad, MonedaEnum inicial, MonedaEnum finals) {
        if (inicial == finals) {
            return cantidad;
        }

        double tasaCambio = obtenerTasaCambio(inicial, finals);
        return cantidad * tasaCambio;
    }
    private double obtenerTasaCambio(MonedaEnum inicial, MonedaEnum finals) {
        try {
            // name devuelve el valor de la constante de Enum
            return tasasCambio.get(inicial.name() + " a " + finals.name());
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Tasa de cambio no encontrada");
        }
    }
    

    
}
