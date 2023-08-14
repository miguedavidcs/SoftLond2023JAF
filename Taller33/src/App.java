import java.util.Scanner;

import com.main.java.modelos.CuentaAhorro;
import com.main.java.modelos.CuentaCorriente;

public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para abrir una Proceso bancario de de depositar 1000");
        double saldoinicial = scanner.nextInt();
        scanner.nextLine();
        CuentaAhorro cuentaAhorro = new CuentaAhorro(saldoinicial, 0.05);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1500, 200); // Ejemplo de cuenta corriente
        
        int opcion;
        
        do {
            System.out.println("Bienvenido al Sistema Bancario");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar (cuenta de ahorro)");
            System.out.println("3. Retirar (cuenta corriente)");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Aplicar intereses (solo cuenta de ahorro)");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    cuentaAhorro.depositar(montoDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar (cuenta de ahorro): ");
                    double montoRetiroAhorro = scanner.nextDouble();
                    cuentaAhorro.retirar(montoRetiroAhorro);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar (cuenta corriente): ");
                    double montoRetiroCorriente = scanner.nextDouble();
                    cuentaCorriente.retirar(montoRetiroCorriente);
                    break;
                case 4:
                    System.out.println("Saldo en cuenta de ahorro: $" + cuentaAhorro.getSaldo());
                    System.out.println("Saldo en cuenta corriente: $" + cuentaCorriente.getSaldo());
                    break;
                case 5:
                    cuentaAhorro.aplicarInteres();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el Sistema Bancario!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
            System.out.println();
            
        } while (opcion != 0);
        
        scanner.close();
    }
}
