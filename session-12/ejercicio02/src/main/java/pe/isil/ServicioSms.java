package pe.isil;

public class ServicioSms implements ServicioMensaje {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("SMS enviado a " + destinatario + " con el mensaje de: " + mensaje);
    }

}
