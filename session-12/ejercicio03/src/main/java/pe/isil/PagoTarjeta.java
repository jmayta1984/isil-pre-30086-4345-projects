package pe.isil;

public class PagoTarjeta implements Pago {
    private String numeroTarjeta;
    private String propietarioTarjeta;

    public PagoTarjeta(String numeroTarjeta, String propietarioTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.propietarioTarjeta = propietarioTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago con el número de tarjeta "
                + tarjetaOculta() + " de "
                + propietarioTarjeta);
    }

    private String tarjetaOculta() {
        return numeroTarjeta.replaceAll("\\d{4}-\\d{4}-\\d{4}-(\\d{4})", "****-****-****-$1");
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getPropietarioTarjeta() {
        return propietarioTarjeta;
    }

    public void setPropietarioTarjeta(String propietarioTarjeta) {
        this.propietarioTarjeta = propietarioTarjeta;
    }

}
