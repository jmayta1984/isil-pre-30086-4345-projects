import java.util.Scanner;

import utils.MathOperations;

public class Main {
 
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        try {
            int number = object.nextInt();
            MathOperations.factorial(number);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        object.close();

    }

   
    
}