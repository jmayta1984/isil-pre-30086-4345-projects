package pe.isil;

public class ServicioVoz implements ServicioMensaje {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Mensaje de voz enviado a " + destinatario + " con el mensaje de: " + mensaje);
    }

}
