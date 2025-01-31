package ec.edu.espol.tareaproyectodiseniosoft.Observer;



public class EmailNotificador implements Observer {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
    


}
