/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DHAMAR
 */
public class IncidenteTest {
    
    @Test
    void testCreacionIncidenteValido() {
        Incidente incidente = new Incidente("Problema con WiFi", 5);
        assertEquals("Problema con WiFi", incidente.getDescripcion());
        assertEquals(5, incidente.getNivelSeveridad());
        assertFalse(incidente.isResuelto());
    }
    
    @Test
    void testCreacionIncidenteValido2() {
        Incidente incidente = new Incidente("Problema con WiFi", 10);
        assertEquals("Problema con WiFi", incidente.getDescripcion());
        assertNotEquals(1, incidente.getNivelSeveridad());
        assertFalse(incidente.isResuelto());
    }
    
    @Test
    void testCreacionIncidenteValido3() {
        Incidente incidente = new Incidente("Problema con WiFi", 2);
        assertEquals("Problema con WiFi", incidente.getDescripcion());
        assertFalse(incidente.getNivelSeveridad()<10 && incidente.getNivelSeveridad()>0);
        assertFalse(incidente.isResuelto());
    }
    @Test
     void testCreacionIncidenteSeveridadValida() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Incidente("Test", 11);
        });
    }
    @Test
     void testCreacionIncidenteSeveridadInvalida() {
        Incidente incidente = new Incidente("Problema con WiFi", 2);
        incidente.setNivelSeveridad(6);
        assertTrue(incidente.getNivelSeveridad()<10);
    }
    
}
