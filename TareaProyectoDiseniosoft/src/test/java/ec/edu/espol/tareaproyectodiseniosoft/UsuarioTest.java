/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author DHAMAR
 */
public class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("U1", "Test User", "test@test.com");
    }
    
    @Test
    void testCreacionUsuario() {
        assertEquals("U1", usuario.getId());
        assertEquals("Test User", usuario.getNombre());
        assertEquals("test@test.com", usuario.getEmail());
    }
    
    @Test
    void testActualizarEmail() {
        usuario.setEmail("nuevo@test.com");
        assertEquals("nuevo@test.com", usuario.getEmail());
    }

    @Test
    void testToString() {
        String expectedString = "Usuario{id='U1', nombre='Test User'}";
        assertEquals(expectedString, usuario.toString());
    }
    
    @Test
    void testRecibirNotificacion() {
        assertDoesNotThrow(() -> usuario.recibirNotificacion("Test notification"));
    }
    @Test
    void testRecibirNotificacionConMensajeNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> usuario.recibirNotificacion(null));
        assertEquals("El mensaje no puede ser nulo o vacío", exception.getMessage());
    }

    @Test
    void testRecibirNotificacionConMensajeVacio() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> usuario.recibirNotificacion(""));
        assertEquals("El mensaje no puede ser nulo o vacío", exception.getMessage());
    }
    
    

}
    