/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft.Builder;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoUnidad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DHAMAR
 */
public class Propiedad {
    private String id;
    private String nombre;
    private String direccion;
    private List<String> reglas;
    private List<Unidad> unidades;
    private Usuario anfitrion;
    
    public Propiedad(String id, String nombre, String direccion, List<String> reglas, List<Unidad> unidades, Usuario anfitrion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.reglas = reglas;
        this.unidades = unidades;
        this.anfitrion = anfitrion;
    }
    
    public void agregarUnidad(Unidad unidad) {
        unidades.add(unidad);
    }

    public void agregarRegla(String regla) {
        reglas.add(regla);
    }

    public List<Unidad> buscarUnidadesDisponibles(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Unidad> disponibles = new ArrayList<>();
        for (Unidad unidad : unidades) {
            if (unidad.estaDisponible(fechaInicio, fechaFin)) {
                disponibles.add(unidad);
            }
        }
        return disponibles;
    }
    
    public List<Unidad> verificarDisponibilidad() {
        List<Unidad> disponibles = new ArrayList<>();
        for (Unidad unidad : unidades) {
            if (unidad.getEstado() == EstadoUnidad.DISPONIBLE) {
                disponibles.add(unidad);
            }
        }
        return disponibles;
    }

}
