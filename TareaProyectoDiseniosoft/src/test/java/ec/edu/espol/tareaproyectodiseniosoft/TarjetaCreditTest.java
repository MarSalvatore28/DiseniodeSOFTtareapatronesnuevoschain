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
public class TarjetaCreditTest {
    TarjetaCredit tarjeta;
     @BeforeEach
    void setUp() {
        tarjeta = new TarjetaCredit();
    }
    @Test
            
    void testProcesarPagoValido() {
        assertTrue(tarjeta.procesar(100.0));
    }
    
    @Test
    void testProcesarPagoValidoConValoresnegativs() {
        assertTrue(tarjeta.procesar(-200));
    }
    
    @Test
    void testProcesarPagoMontoGrande() {
        assertTrue(tarjeta.procesar(999999.99));
    }
    
    
    
}
