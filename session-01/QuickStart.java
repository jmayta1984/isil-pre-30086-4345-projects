/**
 * QuickStart
 */

public class QuickStart {

    public static void main(String[] args) {
        arithmeticOperators();

        assignmentOperators();

        relationalOperators();

        logicalOperators();

        instanceofOperator();

        ternaryOperator();

    }

    private static void ternaryOperator() {
        int februaryDays = 29;
        String result;

        // ternary operator

        System.out.println("Ternary Operator");
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
    }

    private static void instanceofOperator() {
        String str = "ISIL";
        boolean result;

        // checks if str is an instance of
        // the String class

        result = str instanceof String;
        System.out.println("Is str an instance of String? " + result);
    }

    public static void arithmeticOperators() {
        // declare variables
        int a = 12, b = 5;

        System.out.println("Arithmetic Operators");

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modular operator
        System.out.println("a % b = " + (a % b));

        System.out.println();
    }

    public static void assignmentOperators() {
        // declare variables
        int c = 4;
        int var;

        System.out.println("Assignment Operators");

        // assign with =
        var = c;
        System.out.println("var using =: " + var);

        // assing with +=
        var += c;
        System.out.println("var using +=: " + var);

        var = +c;
        System.out.println("var using =+: " + var);

        System.out.println();
    }

    public static void relationalOperators() {
        // declare variables
        int e = 7, f = 11;

        System.out.println("Relational Operators");

        // == operator
        System.out.println(e == f);

        // != operator
        System.out.println(e != f);

        // > operator
        System.out.println(e > f);

        // < operator
        System.out.println(e < f);

        // >= operator
        System.out.println(e >= f);

        // <= operator
        System.out.println(e <= f);
    }

    public static void logicalOperators() {

        // declare variables
        int a = 5, b = 3, c = 8;

        System.out.println("Logical Operators");

        // && operator
        System.out.println((a > b) && (c > b));
        System.out.println((a > b) && (c < b));

        // || operator
        System.out.println((a > b) || (c > b));
        System.out.println((a > b) || (c < b));
        System.out.println((a < b) || (c < b));

        // ! operator
        System.out.println(!(a == b));
        System.out.println(!(a > b));

    }

}
