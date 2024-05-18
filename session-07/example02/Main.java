package example02;

public class Main {
    public static void main(String[] args) {
        String test = "casa";
        System.out.println(test.compareToIgnoreCase("Casa"));

        String greeting = "Hola, ";
        System.out.println(greeting.concat("mundo"));

        String string = "Hello, ISIL";
        System.out.println(string.equals("Hello, ISIL"));
    }    
}
