import java.util.Scanner;

import models.Person;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona: ");
        String name = scanner.next();

        System.out.println("Ingrese la edad de la persona: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);

        System.out.println("Ingrese el nombre de una fruta: ");
        String fruit = scanner.next();

        person.eats(fruit);

        scanner.close();
    }
}
