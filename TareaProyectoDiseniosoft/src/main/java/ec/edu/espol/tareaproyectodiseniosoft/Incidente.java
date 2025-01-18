package ec.edu.espol.tareaproyectodiseniosoft;

import java.util.UUID;

public class Incidente {
    private String id;
    private String descripcion;
    private int nivelSeveridad;
    private boolean resuelto;

    public Incidente(String descripcion, int nivelSeveridad) {
        this.id = UUID.randomUUID().toString();
        this.descripcion = descripcion;
        if (nivelSeveridad < 1 || nivelSeveridad > 10) {
            throw new IllegalArgumentException("El nivel de severidad debe estar entre 1 y 10.");
        }
        this.nivelSeveridad = nivelSeveridad;
        this.resuelto = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelSeveridad() {
        return nivelSeveridad;
    }

    public void setNivelSeveridad(int nivelSeveridad) {
        this.nivelSeveridad = nivelSeveridad;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

}

