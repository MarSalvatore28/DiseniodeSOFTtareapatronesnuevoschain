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
public class ModeradorIncidenteTest {
    private ModeradorIncidente moderador;

    @BeforeEach
    void setUp() {
        moderador = new ModeradorIncidente();
    }

    @Test
    void testManejarIncidenteModerado() {
        Incidente incidente = new Incidente(5);
        moderador.manejarIncidente(incidente);
        assertTrue(incidente.isResuelto());
    }

    @Test
    void testEscalarIncidenteGrave() {
        Incidente incidente = new Incidente(8);
        SoporteLegalIncidente soporteLegal = new SoporteLegalIncidente();
        moderador.establecerSiguiente(soporteLegal);
        
        moderador.manejarIncidente(incidente);
        assertTrue(incidente.isResuelto());
    }

    @Test
    void testManejarMultiplesIncidentes() {
        Incidente incidente1 = new Incidente(4);
        Incidente incidente2 = new Incidente(6);
        
        moderador.manejarIncidente(incidente1);
        moderador.manejarIncidente(incidente2);
        
        assertTrue(incidente1.isResuelto());
        assertTrue(incidente2.isResuelto());
    }

    @Test
    void testSinSiguienteManejador() {
        Incidente incidente = new Incidente(9);
        moderador.manejarIncidente(incidente);
        assertFalse(incidente.isResuelto());
    }
}
    

