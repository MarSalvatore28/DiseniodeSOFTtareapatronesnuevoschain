/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import java.util.Date;

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
