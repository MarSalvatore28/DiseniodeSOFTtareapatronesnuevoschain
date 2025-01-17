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
 * @author DHAMAR
 */
public class Unidad {
    private String id;
    private EstadoUnidad estado;
    private Double precio;
    private List<String> servicios;
    private LocalDate fechaDisponibleDesde;
    private LocalDate fechaDisponibleHasta;

    public Unidad(String id, EstadoUnidad estado, Double precio, List<String> servicios, LocalDate fechaDisponibleDesde, LocalDate fechaDisponibleHasta) {
        this.id = id;
        this.estado = estado;
        this.precio = precio;
        this.servicios = servicios;
        this.fechaDisponibleDesde = fechaDisponibleDesde;
        this.fechaDisponibleHasta = fechaDisponibleHasta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    public LocalDate getFechaDisponibleDesde() {
        return fechaDisponibleDesde;
    }

    public void setFechaDisponibleDesde(LocalDate fechaDisponibleDesde) {
        this.fechaDisponibleDesde = fechaDisponibleDesde;
    }

    public LocalDate getFechaDisponibleHasta() {
        return fechaDisponibleHasta;
    }

    public void setFechaDisponibleHasta(LocalDate fechaDisponibleHasta) {
        this.fechaDisponibleHasta = fechaDisponibleHasta;
    }

    public EstadoUnidad getEstado() {
        return estado;
    }

    public void actualizarEstado(EstadoUnidad nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
