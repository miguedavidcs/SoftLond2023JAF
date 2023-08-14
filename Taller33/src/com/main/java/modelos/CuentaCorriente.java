package com.main.java.modelos;

public class CuentaCorriente {
    private double saldo;
    private double sobregiro;

    public CuentaCorriente(double saldoInicial, double sobregiro) {
        saldo = saldoInicial;
        this.sobregiro = sobregiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron $" + monto + " en la cuenta corriente.");
    }

    public void retirar(double monto) {
        if (monto <= saldo + sobregiro) {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + " de la cuenta corriente.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Corriente - Saldo: $" + saldo + " - Sobregiro: $" + sobregiro;
    }
}
