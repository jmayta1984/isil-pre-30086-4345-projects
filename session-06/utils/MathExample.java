package utils;

import java.util.Scanner;

public class MathExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double number1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double number2 = scanner.nextDouble();
        System.out.println("El mayor número es: " + Math.max(number1, number2));
        scanner.close();
        System.out.println("El menor número es: " + Math.min(number1, number2));
        scanner.close();

        double x = 28.83;

        System.out.println("ceil: " + Math.ceil(x));
        System.out.println("floor: " + Math.floor(x));
        System.out.println("floor: " + Math.round(x));
    }
}
