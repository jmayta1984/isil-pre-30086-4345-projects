package example01;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Luis");
        names.add("Ana");
        System.out.println(names);


        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(15);
        grades.add(17);
        grades.add(18);
        grades.add(20);
        System.out.println(grades);

        System.out.println(grades.get(grades.size()-1));
    }
}