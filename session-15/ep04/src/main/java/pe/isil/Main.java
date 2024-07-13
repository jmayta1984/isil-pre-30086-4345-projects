package pe.isil;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Luis Paredes");
        
        // Crear los libros
        Libro libroFisico = new LibroFisico("1234", "Conversación en la Catedral", "Mario Vargas Llosa", 10, 20);

        Libro libroDigital = new LibroDigital("4567", "Clean Code", "Martin Folker", "https://cleancode.pdf", 15);

        // Crear la reserva 1
        Reserva reserva01 = new Reserva(libroFisico, cliente, 15);
        reserva01.imprimirReserva();

        System.out.println("-------------");

        // Crear la reserva 2
        Reserva reserva02 = new Reserva(libroDigital, cliente, 10);
        reserva02.imprimirReserva();
    }
}