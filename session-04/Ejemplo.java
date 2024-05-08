import java.util.Scanner;

import modelos.Gato;

public class Ejemplo {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del gato: ");
        String nombre = scanner.next();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la raza: ");
        String raza = scanner.next();

        Gato gato = new Gato(nombre, edad, raza);
        gato.maullar();
        scanner.close();
    }
}
