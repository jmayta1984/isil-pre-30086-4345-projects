package pe.isil;

public class ServicioCorreo implements ServicioMensaje {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Correo enviado a " + destinatario + " con el mensaje: " + mensaje);
    }

}
