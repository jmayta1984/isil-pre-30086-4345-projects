package pe.isil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();

        ServicioMensaje servicio;

        System.out.println("Seleccione el servicio de mensaje a utilizar: ");
        System.out.println("1: Correo");
        System.out.println("2: Mensaje de voz");
        System.out.println("3: SMS");

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = scanner.nextInt();
            servicio = switch (opcion) {
                case 1 -> new ServicioCorreo();
                case 2 -> new ServicioVoz();
                default -> new ServicioSms();
            };
        }
        dispositivo.setServicio(servicio);
        dispositivo.enviarMensaje("Hola ISIL", "Francisco Fuentes");

    }
}