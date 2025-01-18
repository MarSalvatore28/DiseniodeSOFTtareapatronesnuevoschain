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
 * @author Marcitou
 */
public class Propiedad {
    String id;
    String nombre;
    String direccion;
    List<String> reglas;
    List<Unidad> unidades;
    Usuario anfitrion;

    Propiedad() {} // Constructor privado para restringir acceso

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<String> getReglas() {
        return reglas;
    }

    public List<Unidad> getUnidades() {
        return unidades;
    }

    public Usuario getAnfitrion() {
        return anfitrion;
    }

}
