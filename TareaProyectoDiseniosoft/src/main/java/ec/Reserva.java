package ec;

import ec.edu.espol.tareaproyectodiseniosoft.Unidad;

public class Reserva {
    private Huesped huesped;
    private Unidad unidad;
    private EstadoPago estado;

    public Reserva(Huesped huesped, Unidad unidad, Date fechaInicio, Date fechaFin) {
        this.huesped = huesped;
        this.unidad = unidad;
        this.estado = EstadoPago.PENDIENTE;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }
}
