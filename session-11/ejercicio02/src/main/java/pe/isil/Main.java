package pe.isil;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(15);
        notas.add(13);
        notas.add(18);
        notas.add(20);
        notas.add(17);
        System.out.println("Lista original: " + notas);
        Collections.sort(notas);
        System.out.println("Lista ordenada ascendentemente: " + notas);
        System.out.println("Index: " + Collections.binarySearch(notas, 12));
        Collections.reverse(notas);
        System.out.println("Lista ordenada descentemente: " + notas);
    }
}