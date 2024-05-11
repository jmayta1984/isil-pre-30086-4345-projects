import java.util.Scanner;

public class ForDeclaration {

    public static void main(String[] args) {
        System.out.print("Ingrese un número entero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        digitSum(number);
        scanner.close();
    }

    public static void countDown(int number) {
        int count;

        for (count = number; count > 0; count--) {
            System.out.println(count);
        }

    }

    public static void countUp(int number) {
        int count;

        for (count = 1; count <= number; count++) {
            System.out.println(count);
        }

    }

    /*
     * Ejercicio 01:
     * Crear una función que calcule la suma de los dígitos de un número.
     * Por ejemplo, si el número es 68, la suma 6 + 8 = 14
     */

    public static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
