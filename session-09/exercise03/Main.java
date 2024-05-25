package exercise03;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jorge");
        names.add("Francisco");
        names.add("Juan");
        names.add("Ana");

        System.out.println(names);
        int index = 3;
        if (names.size() > index) {
            names.set(index, "Carmen");
        }
        System.out.println(names);
    }
}
