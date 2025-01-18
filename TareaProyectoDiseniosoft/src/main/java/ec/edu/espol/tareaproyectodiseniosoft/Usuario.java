package ec.edu.espol.tareaproyectodiseniosoft;

public class Usuario {
    private String id;
    private String nombre;
    private String email;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    
    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }

    // Método de notificación genérico, a ser sobrescrito por las clases hijas
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
    


}
