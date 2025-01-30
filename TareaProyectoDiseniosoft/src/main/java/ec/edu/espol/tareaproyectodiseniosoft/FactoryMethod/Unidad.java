/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoUnidad;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author marsa
 */
public class Unidad {
    private String id;
    private EstadoUnidad estado;
    private UnidadDisponibilidad disponibilidad;
    private UnidadCaracteristicas caracteristicas;
    

    public Unidad(String id, EstadoUnidad estado, UnidadDisponibilidad disponibilidad, UnidadCaracteristicas caracteristicas) {
        this.id = id;
        this.estado = estado;
        this.disponibilidad = disponibilidad;
        this.caracteristicas = caracteristicas;
    
    }
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        return estado == EstadoUnidad.DISPONIBLE && disponibilidad.estaDisponible(fechaInicio, fechaFin);
    }

    
    public Unidad(String id) {
        this.id = id;
    }
    
    
    public void reservar() {
        this.estado = EstadoUnidad.RESERVADA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrecio() {
        return this.caracteristicas.getPrecio();
    }

    public void setPrecio(Double precio) {
        this.caracteristicas.setPrecio(precio);
    }

    public List<String> getServicios() {
        return this.caracteristicas.getServicios();
    }

    public void setServicios(List<String> servicios) {
        this.caracteristicas.setServicios(servicios);;
    }

    public LocalDate getFechaDisponibleDesde() {
        return this.disponibilidad.getFechaDisponibleDesde();
    }

    public void setFechaDisponibleDesde(LocalDate fechaDisponibleDesde) {
        this.disponibilidad.setFechaDisponibleDesde(fechaDisponibleDesde);;
    }

    public LocalDate getFechaDisponibleHasta() {
        return this.disponibilidad.getFechaDisponibleHasta();
    }

    public void setFechaDisponibleHasta(LocalDate fechaDisponibleHasta) {
        this.disponibilidad.setFechaDisponibleHasta(fechaDisponibleHasta);;
    }

    public EstadoUnidad getEstado() {
        return estado;
    }

    public void actualizarEstado(EstadoUnidad nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
