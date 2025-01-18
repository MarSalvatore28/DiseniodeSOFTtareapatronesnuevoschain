package ec.edu.espol.tareaproyectodiseniosoft.Observer;

public class NotificadorAppMensajeria implements Observer {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Enviando mensaje por la app de mensajería: " + mensaje);
    }

}
