package pe.isil;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Carro("Corolla", "Toyota", 4);
        carro.mostrarDatos();

        Vehiculo motocicleta = new Motocicleta("Sportster", "Harley-Davidson", false);
        motocicleta.mostrarDatos();
    }
}