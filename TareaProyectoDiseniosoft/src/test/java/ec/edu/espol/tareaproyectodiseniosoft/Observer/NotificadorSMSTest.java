/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft.Observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author DHAMAR
 */
public class NotificadorSMSTest {
    
    private NotificadorSMS notificador;

    @BeforeEach
    void setUp() {
        notificador = new NotificadorSMS();
    }

    @Test
    void testActualizacionNormal() {
        assertDoesNotThrow(() -> notificador.actualizar("Mensaje de prueba"));
    }

    @Test
    void testActualizacionMensajeVacio() {
        assertDoesNotThrow(() -> notificador.actualizar(""));
    }

    @Test
    void testActualizacionMensajeLargo() {
        String mensajeLargo = "a".repeat(200);
        assertDoesNotThrow(() -> notificador.actualizar(mensajeLargo));
    }


    @Test
    void testActualizacionCaracteresEspeciales() {
        assertDoesNotThrow(() -> notificador.actualizar("¡Mensaje con €special chars! ñ"));
    }

    
}
