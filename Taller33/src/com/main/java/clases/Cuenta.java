package com.main.java.clases;

import com.main.java.interfaces.CuentaBancaria;

public abstract class Cuenta implements CuentaBancaria {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron $" + monto + " en la cuenta.");
    }

    @Override
    public double obtenerSaldo() {
        return saldo;
    }
}