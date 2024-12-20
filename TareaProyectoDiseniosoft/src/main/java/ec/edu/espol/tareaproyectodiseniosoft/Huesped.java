package ec.edu.espol.tareaproyectodiseniosoft;

import java.util.Date;

public class Huesped extends Usuario {

    public Huesped(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void reportarIncidente(String descripcion, ManejadorIncidente manejadorInicial) {
        Incidente incidente = new Incidente(descripcion);
        manejadorInicial.manejar(incidente);
    }

    public void realizarReserva(SistemaHomeStay sistema, Unidad unidad, Date fechaInicio, Date fechaFin, MetodoPago metodo, double monto) {
        Reserva reserva = sistema.crearReserva(this, unidad, fechaInicio, fechaFin);
        if (unidad.getEstado() == EstadoUnidad.DISPONIBLE) {
            unidad.actualizarEstado(EstadoUnidad.RESERVADA);
            sistema.procesarPago(reserva, metodo, monto);
        } else {
            System.out.println("Unidad no disponible.");
        }
    }
}
