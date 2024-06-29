package pe.isil;

public class Main {
    public static void main(String[] args) {
        Pago pago;
        pago = new PagoTarjeta("7892-1245-5674-6859", "Luis Toribio");
        pago.procesarPago(100);
    }
}