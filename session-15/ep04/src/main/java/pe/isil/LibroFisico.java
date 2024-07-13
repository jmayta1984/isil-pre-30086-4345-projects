package pe.isil;

public class LibroFisico extends Libro {
    private int cantidadEjemplares;
    private double tarifaDiaria;

    public LibroFisico(String isbn, String titulo, String autor, int cantidadEjemplares, double tarifaDiaria) {
        super(isbn, titulo, autor);
        this.cantidadEjemplares = cantidadEjemplares;
        this.tarifaDiaria = tarifaDiaria;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(int tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public double calcularTotalReserva(int dias) {
        return dias * tarifaDiaria;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Cantidad de ejemplares: " + cantidadEjemplares);
        System.out.println("Tarifa diaria: " + tarifaDiaria);
    }

}
