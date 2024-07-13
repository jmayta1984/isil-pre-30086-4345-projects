package pe.isil;

public class LibroDigital extends Libro  {
    private String enlaceDescarga;
    private double tarifaDiaria;

    public LibroDigital(String isbn, String titulo, String autor, String enlaceDescarga, double tarifaDiaria) {
        super(isbn, titulo, autor);
        this.enlaceDescarga = enlaceDescarga;
        this.tarifaDiaria = tarifaDiaria;
    }

    public String getEnlaceDescarga() {
        return enlaceDescarga;
    }

    public void setEnlaceDescarga(String enlaceDescarga) {
        this.enlaceDescarga = enlaceDescarga;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public double calcularTotalReserva(int dias) {
        return dias * tarifaDiaria;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Enlace de descarga: " + enlaceDescarga);
        System.out.println("Tarifa diaria: " + tarifaDiaria);
    }

}
