package com.main.java.clases;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
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
        saldo += intereses;
        System.out.println("Se aplicaron intereses a la cuenta de ahorro: $" + intereses);
    }
}





