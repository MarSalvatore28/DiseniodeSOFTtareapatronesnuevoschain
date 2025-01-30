/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author DHAMAR
 */
public class AnfitrionIncidenteTest {
    private AnfitrionIncidente anfitrion;
    private Incidente incidente;

    @BeforeEach
    void setUp() {
        anfitrion = new AnfitrionIncidente();
        incidente = new Incidente(1);
    }
    
    @Test
    void testManejarIncidenteBajaSeveridad() {
        anfitrion.manejarIncidente(incidente);
        assertTrue(incidente.isResuelto());
    }
    
     @Test
    void testSinSiguienteManejador() {
        Incidente incidenteMedio = new Incidente(4);
        anfitrion.manejarIncidente(incidenteMedio);
        assertFalse(incidenteMedio.isResuelto());
    }
    
      @Test
    void testManejoMultiplesIncidentes() {
        Incidente incidente1 = new Incidente(2);
        Incidente incidente2 = new Incidente(3);
        
        anfitrion.manejarIncidente(incidente1);
        anfitrion.manejarIncidente(incidente2);
        
        assertTrue(incidente1.isResuelto());
        assertTrue(incidente2.isResuelto());
    }
    
    

    
    
    
    
    
    
    
    
    
    
}
