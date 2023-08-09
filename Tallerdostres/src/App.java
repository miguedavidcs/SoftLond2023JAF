import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        com.softlond.opereacion.Operacion operacion = new com.softlond.opereacion.Operacion();

        System.out.print("Ingrese una expresión matemática: ");
        String expresion = scanner.nextLine();

        double resultado = operacion.realizarCalculo(expresion);
        System.out.println("El resultado es: " + resultado);

        scanner.close();

    }
}
