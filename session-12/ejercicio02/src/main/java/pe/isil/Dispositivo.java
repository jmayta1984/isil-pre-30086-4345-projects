package pe.isil;

public class Dispositivo {
    private ServicioMensaje servicio;

    public void setServicio(ServicioMensaje servicio) {
        this.servicio = servicio;
    }

    public void enviarMensaje(String mensaje, String destinatario) {
        servicio.enviarMensaje(mensaje, destinatario);
    }

}
