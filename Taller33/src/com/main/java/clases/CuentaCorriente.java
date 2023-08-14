package com.main.java.clases;

public class CuentaCorriente extends Cuenta {
    private double sobregiro;

    public CuentaCorriente(double saldoInicial, double sobregiro) {
        super(saldoInicial);
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo + sobregiro) {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + " de la cuenta corriente.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }
}
