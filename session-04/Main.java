import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Ingrese un número entero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        showWeekDay(number);
        scanner.close();
    }

    public static void showWeekDay(int number) {

        switch (number) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ingrese un número entre 1  y 7");

                break;
        }

    }
}