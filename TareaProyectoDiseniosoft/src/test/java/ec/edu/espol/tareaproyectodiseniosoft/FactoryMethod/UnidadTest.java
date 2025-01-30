
package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoUnidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;

import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;

import java.time.LocalDate;

import java.time.LocalDate;

/**
 *
 * @author DHAMAR
 */
public class UnidadTest {
    Unidad unidad;
    @BeforeEach
    void setUp() {
        unidad = new Unidad("U001", EstadoUnidad.DISPONIBLE, 100.0,
            Arrays.asList("WiFi", "TV"), 
            LocalDate.now(), 
            LocalDate.now().plusDays(30));
    }   
    
    @Test
    void testEstaDisponibleEnFechasValidas() {
        LocalDate inicio = LocalDate.now().plusDays(1);
        LocalDate fin = LocalDate.now().plusDays(5);
        assertTrue(unidad.estaDisponible(inicio, fin));
    }
    
    @Test
    void testEstaDisponibleEnFechasNoValidas() {
        unidad.actualizarEstado(EstadoUnidad.OCUPADA);
        LocalDate inicio = LocalDate.now().plusDays(1);
        LocalDate fin = LocalDate.now().plusDays(5);
        assertFalse(unidad.estaDisponible(inicio, fin));
    }
    
    @Test 
    void testReservar(){
        unidad.reservar();
        assertEquals(unidad.getEstado(), "RESERVADA");
    }
    
}

