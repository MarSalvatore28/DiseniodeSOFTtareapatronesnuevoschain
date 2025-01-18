/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoPago;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Huesped;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author DHAMAR
 */
public class Reserva {
    private int id;
    private Date fechainicio;
    private Date fechafin;
    private Huesped huesped;
    private Unidad unidad;

    private List<Observer> observers = new ArrayList<>();
    private String estado;

    public Reserva(Huesped huesped, Unidad unidad, Date fechaInicio, Date fechaFin) {
        this.huesped = huesped;
        this.unidad = unidad;
        this.estado = "PENDIENTE";
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Reserva(String estadoInicial) {
        this.estado = estadoInicial;
    }
    
    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservers("El estado de la reserva ha cambiado a: " + nuevoEstado);
    }

    @Override
    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void quitarObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String mensaje) {
        for (Observer observer : observers) {
            observer.actualizar(mensaje);
        }
    }

}
