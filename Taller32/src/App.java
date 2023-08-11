
import java.util.Scanner;

import softlon.canales.CorreoElectronico;
import softlon.canales.MensajeTexto;
import softlon.canales.NotificacionPush;
import softlon.notificacion.CanalNotificacion;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = crearUsuario(scanner);

        System.out.println("Bienvenido, " + usuario.getNombre() + "!");

        while (true) {
            System.out.println("Elige una opción:");
            System.out.println("1. Suscribirse a un canal de notificación");
            System.out.println("2. Enviar notificación");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    suscribirUsuarioACanal(usuario, scanner);
                    break;
                case 2:
                    enviarNotificacion(usuario, scanner);
                    break;
                case 3:
                    System.out.println("¡Hasta luego, " + usuario.getNombre() + "!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Introduce un número del 1 al 3.");
            }
        }
    }

    private static Usuario crearUsuario(Scanner scanner) {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next();
        return new Usuario(nombre);
    }

    private static void suscribirUsuarioACanal(Usuario usuario, Scanner scanner) {
        System.out.println("Elige un canal de notificación:");
        System.out.println("1. Correo Electrónico");
        System.out.println("2. Mensaje de Texto");
        System.out.println("3. Notificación Push");
        int opcion = scanner.nextInt();

        CanalNotificacion canal = null;

        switch (opcion) {
            case 1:
                canal = new CorreoElectronico("Correo Electrónico", "midacasa17@gmal.com");
                break;
            case 2:
                canal = new MensajeTexto("Mensaje de Texto", "+573105079318");
                break;
            case 3:
                canal = new NotificacionPush("Notificación Push", "A1067944272");
                break;
            default:
                System.out.println("Opción inválida. No se ha realizado la suscripción.");
        }

        if (canal != null) {
            usuario.suscribirse(canal);
            System.out.println("Te has suscrito a " + canal.getNombreCanal());
        }
    }

    private static void enviarNotificacion(Usuario usuario, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Escribe el mensaje de la notificación: ");
        String mensaje = scanner.nextLine();

        usuario.recibirNotificacion(mensaje);
        for (CanalNotificacion canal : usuario.getCanalesSuscritos()) {
            canal.enviar();
        }
    }
}
