package ec.edu.espol.tareaproyectodiseniosoft;

import java.util.UUID;



public class Incidente {
    private String id;
    private String descripcion;
    private int nivelSeveridad;
    private boolean resuelto;

    // Constructor que recibe solo nivelSeveridad
    public Incidente(int nivelSeveridad) {
        if (nivelSeveridad < 1 || nivelSeveridad > 10) {
            throw new IllegalArgumentException("El nivel de severidad debe estar entre 1 y 10.");
        }
        this.nivelSeveridad = nivelSeveridad;
        this.resuelto = false;
    }

    // Constructor que recibe descripcion y nivelSeveridad
    public Incidente(String descripcion, int nivelSeveridad) {
        if (nivelSeveridad < 1 || nivelSeveridad > 10) {
            throw new IllegalArgumentException("El nivel de severidad debe estar entre 1 y 10.");
        }
        this.descripcion = descripcion;
        this.nivelSeveridad = nivelSeveridad;
        this.resuelto = false;
    }

    // Métodos getter y setter
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
        if (nivelSeveridad < 1 || nivelSeveridad > 10) {
            throw new IllegalArgumentException("El nivel de severidad debe estar entre 1 y 10.");
        }
        this.nivelSeveridad = nivelSeveridad;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }
}