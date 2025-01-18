/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Observer.EmailNotificador;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Notificador;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ManejadorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ModeradorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.SoporteLegalIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.AnfitrionIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.CasaFactory;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.DepartamentoFactory;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.HabitacionPrivadaFactory;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadFactory;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marsa
 */
public class Main {
    public static void main(String[] args) {
UnidadFactory habitacionFactory = new HabitacionPrivadaFactory();
        Unidad habitacion = habitacionFactory.crearUnidad("H001", 100.0, List.of("WiFi", "TV"), LocalDate.now(), LocalDate.now().plusDays(5));
        
        UnidadFactory departamentoFactory = new DepartamentoFactory();
        Unidad departamento = departamentoFactory.crearUnidad("D001", 200.0, List.of("WiFi", "Cocina"), LocalDate.now(), LocalDate.now().plusDays(10));
        
        UnidadFactory casaFactory = new CasaFactory();
        Unidad casa = casaFactory.crearUnidad("C001", 300.0, List.of("WiFi", "Jardín", "Piscina"), LocalDate.now(), LocalDate.now().plusDays(15));


    }
}