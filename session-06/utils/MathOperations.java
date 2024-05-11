package utils;

public class MathOperations {
    /*
     * Class methods
     */
    public static void factorial(int number) {
        if (number <= 0) {
            System.out.println("Debe ingresar un número entero positivo");
            return;
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("El factorial de " + number + " es: " + result);

    }
}
