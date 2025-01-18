package ec.edu.espol.tareaproyectodiseniosoft.Observer;

public class NotificadorSMS implements Observer {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

}
