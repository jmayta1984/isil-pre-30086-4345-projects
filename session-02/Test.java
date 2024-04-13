import java.util.Scanner;

public class Test {
    static int x = 11;
    private int y = 33;

    public void testing(int x) {
        Test test = new Test();
        Test.x = 22;
        y = 44;

        System.out.println("Test.x: " +  Test.x);
        System.out.println("x: " + x);
        System.out.println("test.y: " + test.y);
        System.out.println("y: " + this.y);

    }

    public static void main(String[] args) {
        Test t = new Test();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        t.testing(x);
    }
}
