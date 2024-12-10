/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DHAMAR
 */
public class Propiedad {
    private int id;
    private String nombre;
    private String direccion;
    private String reglas;
    private List<Unidad> unidades;

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
