package ec.edu.espol.tareaproyectodiseniosoft;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String email;

    //la clase existe para que mas adelante podamos simular un usuario mas personalizado 
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        //email usuario
        return email;
    }


}
