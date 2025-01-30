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
public class NotificadorAppMensajeriaTest {
    
    private NotificadorAppMensajeria notificador;

    @BeforeEach
    void setUp() {
        notificador = new NotificadorAppMensajeria();
    }

    @Test
    void testActualizacionEstandar() {
        assertDoesNotThrow(() -> notificador.actualizar("Notificación de prueba"));
    }

    @Test
    void testActualizacionMultilinea() {
        String mensajeMultilinea = "Línea 1\nLínea 2\nLínea 3";
        assertDoesNotThrow(() -> notificador.actualizar(mensajeMultilinea));
    }
    
    @Test
    void testActualizacionMensajeJSON() {
        String mensajeJSON = "{\"tipo\":\"notificacion\",\"contenido\":\"test\"}";
        assertDoesNotThrow(() -> notificador.actualizar(mensajeJSON));
    }


    @Test
    void testActualizacionMensajeNull() {
        assertThrows(NullPointerException.class, () -> notificador.actualizar(null));
    }
    
}
