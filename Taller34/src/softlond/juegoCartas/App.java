package softlond.juegoCartas;

import java.util.Scanner;

import com.juegodecartas.juegos.JuegosCartas;

import softlond.juegoCartas.mazos.MazoPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        MazoPrincipal mazo = new MazoPrincipal(true);

        JuegosCartas juego = new JuegosCartas(mazo);

        while (true) {
            System.out.println("=== Juego de Cartas ===");
            System.out.println("1. Jugar");
            System.out.println("2. Revolver cartas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea dejada por nextInt()

            switch (opcion) {
                case 1:
                    juego.jugar();
                    break;
                case 2:
                    mazo.revolverCartas();;
                    System.out.println("Cartas revueltas.");
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
