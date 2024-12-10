package ec.edu.espol.tareaproyectodiseniosoft;

public class Unidad {
    private EstadoUnidad estado;

    public EstadoUnidad getEstado() {
        return estado;
    }

    public void actualizarEstado(EstadoUnidad nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
