package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ManejadorIncidente;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    // Método de notificación genérico, a ser sobrescrito por las clases hijas
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
    


    void reportarIncidente(String incidente_menor, ManejadorIncidente anfitrion, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
