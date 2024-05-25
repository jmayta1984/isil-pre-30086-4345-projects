package exercise02;

import java.util.ArrayList;

/**
 * Main
 */
public class Main {
   public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jorge");
        names.add("Francisco");
        names.add("Juan");
        names.add("Ana");

        System.out.println(names);
        insertInStartPosition(names, "Pedro");
        System.out.println(names);
    }

    public static void insertInStartPosition (ArrayList<String> names, String name) {
        names.add(0, name);
    }
    
}