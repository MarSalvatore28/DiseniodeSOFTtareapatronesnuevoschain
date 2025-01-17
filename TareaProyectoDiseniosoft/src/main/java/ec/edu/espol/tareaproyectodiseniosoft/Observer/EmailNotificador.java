package ec.edu.espol.tareaproyectodiseniosoft.Observer;

import ec.edu.espol.tareaproyectodiseniosoft.Observer.Notificador;

public class EmailNotificador implements Notificador {
    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }


}
