package ec.edu.espol.tareaproyectodiseniosoft;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String email;

    
     public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
     
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    


}
