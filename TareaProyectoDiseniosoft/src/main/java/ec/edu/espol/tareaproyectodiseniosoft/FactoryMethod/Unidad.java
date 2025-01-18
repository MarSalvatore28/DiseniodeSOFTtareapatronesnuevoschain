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

    public Unidad(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean estaDisponible() {
        // Lógica de disponibilidad
        return true; // Simulación
    }
}
