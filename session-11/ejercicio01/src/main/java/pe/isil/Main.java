package pe.isil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static ArrayList<Camisa> camisas = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos();
        mostrarDatos(1);
        ordenarDatos();
        mostrarDatos(1);
        buscarCamisa(new Camisa(1, "Slim fit", "Small", 90));
    }

    private static void buscarCamisa(Camisa camisa) {

        int index = Collections.binarySearch(camisas, camisa, new Comparator<Camisa>() {

            @Override
            public int compare(Camisa camisa0, Camisa camisa1) {

                Double valor0 = camisa0.getPrecio();
                Double valor1 = camisa1.getPrecio();
                return valor0.compareTo(valor1);

            }

        });

        System.out.println(index);
    }

    private static void ordenarDatos() {
        Collections.sort(camisas, new Comparator<Camisa>() {

            @Override
            public int compare(Camisa camisa0, Camisa camisa1) {

                Double valor0 = camisa0.getPrecio();
                Double valor1 = camisa1.getPrecio();
                return valor0.compareTo(valor1);

            }

        });
    }

    private static void mostrarDatos(int opcion) {

        switch (opcion) {
            case 1:
                System.out.println("Opción 1");
                camisas.forEach((camisa) -> System.out.println(camisa.toString()));
                System.out.println();
                break;
            case 2:
                System.out.println("Opción 2");
                for (Camisa camisa : camisas) {
                    System.out.println(camisa.toString());
                }
                break;
            default:
                System.out.println("Opción 3");
                for (int index = 0; index < camisas.size(); index++) {
                    System.out.println(camisas.get(index).toString());
                }
                break;
        }

    }

    private static void cargarDatos() {
        Camisa camisa01 = new Camisa(1, "Slim fit", "Small", 90);
        Camisa camisa02 = new Camisa(2, "Standar fit", "Small", 70);
        Camisa camisa03 = new Camisa(3, "Oversize", "Small", 150);
        Camisa camisa04 = new Camisa(4, "Strech fit", "Small", 80);

        camisas.add(camisa01);
        camisas.add(camisa02);
        camisas.add(camisa03);
        camisas.add(camisa04);

    }

}