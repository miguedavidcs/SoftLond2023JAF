package com.main.java.interfaces;

public interface CuentaBancaria {
    void depositar(double cantidad);
    void retirar(double cantidad);
    double obtenerSaldo();
}
