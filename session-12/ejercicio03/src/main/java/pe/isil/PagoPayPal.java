package pe.isil;

public class PagoPayPal implements Pago {
    private String correo;

    public PagoPayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago vía PayPal con la cuenta de " + correo);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
