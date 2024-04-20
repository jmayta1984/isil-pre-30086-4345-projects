/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student studentLuis = new Student();
        studentLuis.name = "Luis";
        studentLuis.age = 25;
        studentLuis.study();

        Student studentAna = new Student();
        studentAna.name = "Ana";
        studentAna.age = 26;
        studentAna.study();

    }
}

/*
 * En base al tipo de dato de retorno
 * - devuelven un valor de un tipo de dato
 * - no devuelven valor (void)
 * 
 * En base
 * - método de clase: puedes invocarlo directamente con el nombre de la clase
 * (static)
 * - método de instancia: para invocarlo se debe crear una instancia de la clase
 */