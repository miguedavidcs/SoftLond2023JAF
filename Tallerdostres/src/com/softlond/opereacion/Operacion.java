package com.softlond.opereacion;

public class Operacion {
    public double realizarOperacion(double num1, char operador, double num2) {
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operador no válido.");
                System.exit(0);
        }

        return resultado;
    }
}
