package example04;

public class Main {
    public static void main(String[] args) {
        System.out.println(verify("Prueba de cadenas", "Prueba"));
        print("Bienvenido a ISIL");
    }

    // Crear una función que verifique si una cadena se encuentra dentro de otra
    public static boolean verify(String s1, String s2) {
        return s1.contains(s2);
    }

    // Crear una función que imprima en pantalla cada uno de los carácteres de la cadena.
    public static void print(String s1) {
        int length = s1.length();

        for (int index = 0; index <length; index ++) {
            System.out.println(s1.charAt(index));
        }
    }
}
