package pe.isil;

public class Reserva {
    private Libro libro;
    private Cliente cliente;
    private int dias;

    // Inyección de dependencia por constructor
    public Reserva(Libro libro, Cliente cliente, int dias) {
        this.libro = libro;
        this.cliente = cliente;
        this.dias = dias;
    }

    public Libro getLibro() {
        return libro;
    }

    // Inyección de dependencia por método
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Inyección de dependencia por método
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private double calcularTotalReserva() {
        return libro.calcularTotalReserva(dias);
    }

    public void imprimirReserva() {
        cliente.imprimirInfo();
        libro.imprimirInfo();
        System.out.println("Días: " + dias);
        System.out.println("Total: " + calcularTotalReserva());
    }
}
