import java.util.Scanner;
import modelos.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");
        persona1.setEdad(25);
        persona1.setDni("72548569");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fruta: ");
        String fruta = scanner.next();
        persona1.comer(fruta);

        // Constructor: crear instancias/objetos de una clase
        Persona persona2 = new Persona();
        persona2.setNombre("Ana");
        persona2.setEdad(20);
        persona2.setDni("97865412");
        persona2.dormir();

        scanner.close();
    }
}
