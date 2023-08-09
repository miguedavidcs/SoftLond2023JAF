import java.util.InputMismatchException;
import java.util.Scanner;

import com.softlond.opereacion.Operacion;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Ingrese el operador (+, -, *, /): ");
            char simbolo = scanner.next().charAt(0);

            System.out.print("Ingrese el segundo número: ");
            double n2 = scanner.nextDouble();

            Operacion calculadora = new Operacion();
            double resultado = calculadora.realizarOperacion(n1, simbolo, n2);

            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Asegúrese de ingresar números y operadores válidos.");
        }

        scanner.close();
    }
}
