import java.util.Scanner;

import Abstracto.Empleado;
import Model.Asalariado;
import Model.Independiente;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del asalariado: ");
        String nombreAsalariado = scanner.nextLine();
        System.out.print("Ingrese el salario mensual del asalariado: ");
        double salarioMensual = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese el nombre del empleado independiente por horas: ");
        String nombrePorHoras = scanner.nextLine();
        System.out.print("Ingrese el salario por hora del empleado por horas: ");
        double salarioPorHora = scanner.nextDouble();
        System.out.print("Ingrese las horas trabajadas del empleado por horas: ");
        int horasTrabajadas = scanner.nextInt();

        Empleado[] empleados = {
            new Asalariado(nombreAsalariado, salarioMensual),
            new Independiente(nombrePorHoras, salarioPorHora, horasTrabajadas)
        };
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombre + " - Salario: $" + empleado.calcularSalario());
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}
