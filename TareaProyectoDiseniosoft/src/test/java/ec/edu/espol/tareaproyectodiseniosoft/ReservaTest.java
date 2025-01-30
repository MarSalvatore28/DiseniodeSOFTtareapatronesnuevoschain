/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Observer;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DHAMAR
 */
public class ReservaTest {
    
    @Test
    void testCrearReserva() {
        Huesped huesped = new Huesped("1", "Juan", "juan@example.com");
        Unidad unidad = new Unidad("U001");
        Date fechaInicio = new Date();
        Date fechaFin = new Date();

        Reserva reserva = new Reserva(huesped, unidad, fechaInicio, fechaFin);

        assertEquals(huesped, reserva.getHuesped());
        assertEquals(unidad, reserva.getUnidad());
    }
    
    void testCrearReservaWithNull() {
        Huesped huesped = new Huesped("1", "Juan", "juan@example.com");
        Unidad unidad = new Unidad(null);
        Date fechaInicio = new Date();
        Date fechaFin = new Date();

        Reserva reserva = new Reserva(huesped, unidad, fechaInicio, fechaFin);

        assertEquals(huesped, reserva.getHuesped());
        assertEquals(unidad, reserva.getUnidad());
    }
    
    void testCrearReserva3() {
        Huesped huesped = new Huesped("", "Juan", "juan@example.com");
        Unidad unidad = new Unidad("001");
        Date fechaInicio = new Date();
        Date fechaFin = new Date();

        Reserva reserva = new Reserva(huesped, unidad, fechaInicio, fechaFin);

        assertEquals(huesped, reserva.getHuesped());
        assertNotEquals(unidad, reserva.getUnidad());
    }
    
    @Test
    void testCambiarEstado2() {
        Reserva reserva = new Reserva("PENDIENTE");
        reserva.cambiarEstado("CONFIRMADA");
        assertEquals("CONFIRMADA", reserva.getEstado());
    }
    
    @Test
    void testEstadoInvalido() {
        Reserva reserva = new Reserva("PENDIENTE");
        reserva.cambiarEstado("INVALIDO");
        assertNotEquals("INVALIDO", reserva.getEstado()); // Simulación de validación
    }
   
}
