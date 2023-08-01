import java.util.Scanner;
/**
 * @author miguel david castaño salgado 
 */
public class App {
    /**
     * @category NIVEL BASICO
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner escribir = new Scanner(System.in);
        // Ejercicio1
        System.out.print("Ejercicio 1: Ingresa el primer número: ");
        int num1 = escribir.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = escribir.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Ejercicio 2
        System.out.print("\nEjercicio 2: Ingresa un número entero: ");
        int numEntero = escribir.nextInt();
        if (numEntero % 2 == 0) {
            System.out.println(numEntero + " es un número PAR.");
        } else {
            System.out.println(numEntero + " es un número IMPAR.");
        }

        // Ejercicio 3
        System.out.print("\nEjercicio 3: Ingresa el (r) Radio del círculo: ");
        double radio = escribir.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        // Ejercicio 4
        System.out.print("\nEjercicio 4: Ingresa su edad: ");
        int edad = escribir.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Ejercicio 5
        System.out.print("\nEjercicio 5: Ingresa el primer número: ");
        int numero1 = escribir.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = escribir.nextInt();
        int mayor = Math.max(numero1, numero2);
        System.out.println("El mayor de los dos números es: " + mayor);

        // Ejercicio 6
        System.out.print("\nEjercicio 6: Ingresa un número: ");
        int numero = escribir.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejercicio 7
        System.out.print("\nEjercicio 7: Ingresa un número entero positivo: ");
        int tablaNum = escribir.nextInt();
        if (tablaNum <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(tablaNum + " x " + i + " = " + (tablaNum * i));
            }
        }

        // Ejercicio 8 esto esta comentado para poder hacer consola bien se demora mucho en adivinar8
/*         System.out.println("\nEjercicio 8: Juego de adivinar un número entre 1 y 100.");
        int nInconnita = (int) (Math.random() * 100) + 1;
        int i = 0;//intentos
        int nIngresado;
        do {
            System.out.print("Ingresa un número entre 1 y 100: ");
            nIngresado = escribir.nextInt();
            i++;
            if (nIngresado > nInconnita) {
                System.out.println("El número ingresado es mayor que el número a adivinar.");
            } else if (nIngresado < nInconnita) {
                System.out.println("El número ingresado es menor que el número a adivinar.");
            }
        } while (nIngresado != nInconnita);
        System.out.println("¡Hasta que por fin lo lograste! Adivinaste el número " + nInconnita + " en intentos:" + i);
 */
        // Ejercicio 9
        System.out.print("\nEjercicio 9: Ingresa un número entero positivo: ");
        int numFactorial = escribir.nextInt();
        if (numFactorial < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int[] resultados = new int[numFactorial + 1];
            resultados[0] = 1;
            for (int k = 1; k <= numFactorial; k++) {
                resultados[k] = resultados[k - 1] * k; // Corrección aquí: usar 'k' en lugar de 'i'
            }
            System.out.println("El factorial de " + numFactorial + " es: " + resultados[numFactorial]);
        }

        // Ejercicio 10
        System.out.println("\nEjercicio 10: Los primeros 20 números de la serie Fibonacci.");
        int n = 20;
        int v1 = 0;
        int v2 = 1;
        for (int k = 1; k <= n; k++) {
            System.out.print(v1 + " ");
            int acomulados = v1 + v2;
            v1 = v2;
            v2 = acomulados;
        }
        escribir.close();
    }

    }


