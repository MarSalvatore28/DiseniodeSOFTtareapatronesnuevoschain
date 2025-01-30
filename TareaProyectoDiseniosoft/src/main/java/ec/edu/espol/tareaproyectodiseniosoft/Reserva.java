package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoPago;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Observer;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Subject;
import ec.edu.espol.tareaproyectodiseniosoft.Huesped;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DHAMAR
 */
public class Reserva implements Subject {  // Implementar la interfaz Sujeto
    private int id;
    private Date fechaInicio;
    private Date fechaFin;
    private Huesped huesped;
    private Unidad unidad;
    private List<Observer> observers = new ArrayList<>();
    private EstadoReserva estado;

    public Reserva(Huesped huesped, Unidad unidad, Date fechaInicio, Date fechaFin) {
        this.huesped = huesped;
        this.unidad = unidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = EstadoReserva.PENDIENTE; // Estado inicial
    }

    public Reserva(EstadoReserva estadoInicial) {
        this.estado = estadoInicial;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void cambiarEstado(EstadoReserva nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservers("El estado de la reserva ha cambiado a: " + nuevoEstado);
    }

    @Override
    public void agregarObserver(Observer observer) {
        observers.add(observer);  // Agregar el observer a la lista
    }

    @Override
    public void quitarObserver(Observer observer) {
        observers.remove(observer);  // Eliminar el observer de la lista
    }

    @Override
    public void notificarObservers(String mensaje) {
        for (Observer observer : observers) {
            observer.actualizar(mensaje);  // Notificar a todos los observers
        }
    }
}

