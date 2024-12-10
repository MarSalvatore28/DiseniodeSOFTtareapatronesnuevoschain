package ec.edu.espol.tareaproyectodiseniosoft;

public class EmailNotificador implements Notificador {
    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }


}
