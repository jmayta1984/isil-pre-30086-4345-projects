import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* 

        // greeting
        Test.greeting("Ana");
        
        // greetingStudent
        Student student = new Student();
        student.age = 34;
        student.name = "Francisco";
        Test.greetingStudent(student);

        */

        // showRectangleArea
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);
        rectangle.height = scanner.nextInt();
        rectangle.width = scanner.nextInt();
        Test.showRectangleArea(rectangle);
        scanner.close();

    }

    public static void greeting(String name) {
        System.out.println("Hi, " + name);
    }

    public static void greetingStudent(Student student) {
        System.out.println("Hi " + student.name + ", you are " + student.age + " years old.");
    }

    public static int calculateRectangleArea(Rectangle rectangle){
        return rectangle.height * rectangle.width;
    }

    public static void showRectangleArea(Rectangle rectangle) {
        if (rectangle.height == rectangle.width) {
            System.out.println("Not a rectangle!");
            return;
        } 
        System.out.println("Rectangle are: " + Test.calculateRectangleArea(rectangle));   
    }
}
