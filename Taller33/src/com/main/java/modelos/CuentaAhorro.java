package com.main.java.modelos;

public class CuentaAhorro {
    private double saldo;
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron $" + monto + " en la cuenta de ahorro.");
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + " de la cuenta de ahorro.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void aplicarInteres() {
        double intereses = saldo * tasaInteres;
        saldo -= intereses;
        System.out.println("Se aplicaron intereses a la cuenta de ahorro: $" + intereses);
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorro - Saldo: $" + saldo + " - Tasa de Interés: " + (tasaInteres * 100) + "%";
    }
}
