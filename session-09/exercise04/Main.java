package exercise04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jorge");
        names.add("Francisco");
        names.add("Juan");
        names.add("Ana");

        filter(names, 6);

        System.out.println(names);
    }

    public static void filter(ArrayList<String> names, int size) {

        for (int index = names.size() - 1; index >= 0; index--) {
            if(names.get(index).length() < size) {
                names.remove(index);
            }
        }

    }
}
