package com.softlond.opereacion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Operacion {
    public double realizarCalculo(String expresion) {
        return evaluarExpresion(expresion);
    }

    private double evaluarExpresion(String expresion) {
        expresion = expresion.replaceAll(" ", "");

        while (expresion.contains("(")) {
            int indexAbre = expresion.lastIndexOf("(");
            int indexCierra = expresion.indexOf(")", indexAbre);

            String subExpresion = expresion.substring(indexAbre + 1, indexCierra);
            double resultadoSubExpresion = evaluarExpresion(subExpresion);

            expresion = expresion.replace("(" + subExpresion + ")", String.valueOf(resultadoSubExpresion));
        }

        while (expresion.contains("*") || expresion.contains("/")) {
            int indexMultiplicacion = expresion.indexOf("*");
            int indexDivision = expresion.indexOf("/");

            int indexOperador = Math.min(indexMultiplicacion, indexDivision);

            String subExpresion = obtenerSubExpresion(expresion, indexOperador);
            double resultadoSubExpresion = evaluarSubExpresion(subExpresion);

            expresion = reemplazarSubExpresion(expresion, subExpresion, String.valueOf(resultadoSubExpresion));
        }

        return evaluarOperaciones(expresion);
    }

    private String obtenerSubExpresion(String expresion, int indexOperador) {
        int inicioSubExpresion = indexOperador;
        while (inicioSubExpresion > 0 && esOperador(expresion.charAt(inicioSubExpresion - 1))) {
            inicioSubExpresion--;
        }

        int finSubExpresion = indexOperador + 1;
        while (finSubExpresion < expresion.length() && esOperador(expresion.charAt(finSubExpresion))) {
            finSubExpresion++;
        }

        return expresion.substring(inicioSubExpresion, finSubExpresion);
    }

    private boolean esOperador(char caracter) {
        return caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/';
    }

    private double evaluarSubExpresion(String subExpresion) {
        Deque<Double> numeros = new ArrayDeque<>();
        Deque<Character> operadores = new ArrayDeque<>();

        try (Scanner scanner = new Scanner(subExpresion).useDelimiter("\\s*")) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    numeros.push(scanner.nextDouble());
                } else {
                    char operador = scanner.next().charAt(0);
                    while (!operadores.isEmpty() && getPrecedencia(operador) <= getPrecedencia(operadores.peek())) {
                        aplicarOperador(numeros, operadores.pop());
                    }
                    operadores.push(operador);
                }
            }

            while (!operadores.isEmpty()) {
                aplicarOperador(numeros, operadores.pop());
            }

            scanner.close();
        }

        return numeros.pop();
    }

    private int getPrecedencia(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        }
        return 0;
    }

    private void aplicarOperador(Deque<Double> numeros, char operador) {
        double numero2 = numeros.pop();
        double numero1 = numeros.pop();
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
        }

        numeros.push(resultado);
    }

    private String reemplazarSubExpresion(String expresion, String subExpresion, String resultado) {
        return expresion.replace(subExpresion, resultado);
    }

    private double evaluarOperaciones(String expresion) {
        Deque<Double> numeros = new ArrayDeque<>();
        Deque<Character> operadores = new ArrayDeque<>();

        try (Scanner scanner = new Scanner(expresion).useDelimiter("\\s*")) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    numeros.push(scanner.nextDouble());
                } else {
                    char operador = scanner.next().charAt(0);
                    while (!operadores.isEmpty() && getPrecedencia(operador) <= getPrecedencia(operadores.peek())) {
                        aplicarOperador(numeros, operadores.pop());
                    }
                    operadores.push(operador);
                }
            }

            while (!operadores.isEmpty()) {
                aplicarOperador(numeros, operadores.pop());
            }

            scanner.close();
        }

        return numeros.pop();
    }
}
