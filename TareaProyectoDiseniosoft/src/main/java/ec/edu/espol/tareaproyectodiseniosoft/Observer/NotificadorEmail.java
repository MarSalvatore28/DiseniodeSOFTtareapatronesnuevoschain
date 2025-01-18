package ec.edu.espol.tareaproyectodiseniosoft.Observer;

public class NotificadorEmail implements Observer {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }

}
