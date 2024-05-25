package exercise01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jorge");
        names.add("Francisco");
        names.add("Juan");
        names.add("Ana");

        iterate(names);
    }

    public static void iterate(ArrayList<String> names) {
        for (String name: names) {
            System.out.println(name);
        }
    }

}
