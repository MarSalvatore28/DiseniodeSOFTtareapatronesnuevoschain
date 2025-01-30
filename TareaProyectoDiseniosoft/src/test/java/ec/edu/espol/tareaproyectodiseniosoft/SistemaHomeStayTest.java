/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Builder.Propiedad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Notificador;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.NotificadorEmail;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author DHAMAR
 */
public class SistemaHomeStayTest {
    SistemaHomeStay sistema;
    Unidad unidad;
    Huesped huesped;
     @BeforeEach
    void setUp() {
        sistema = new SistemaHomeStay((Notificador) new NotificadorEmail());
        huesped = new Huesped("2", "Carlos", "carlos@example.com");
        unidad = new Unidad("U002");
    }
    
    @Test
    void testBuscarPropiedadesVacia() {
        List<Propiedad> resultado = sistema.buscarPropiedades("WiFi");
        assertTrue(resultado.isEmpty());
    }
    @Test
    void testCrearReservaExitosa() {
        Reserva reserva = sistema.crearReserva(huesped, unidad, new Date(), new Date());
        assertNotNull(reserva);
    }
    
    @Test
    void testPagoFallido() {
        Reserva reserva = new Reserva("PENDIENTE");
        MetodoPago metodo = monto -> false; // Simulación de pago fallido

        boolean resultado = sistema.procesarPago(reserva, metodo, 100.0);
        assertFalse(resultado);
    }
    
    @Test
    void testProcesarPagoExitoso() {
        Date inicio = new Date();
        Date fin = new Date(inicio.getTime() + 86400000);
        Reserva reserva = sistema.crearReserva(huesped, unidad, inicio, fin);
        MetodoPago metodoPago = new TarjetaCredit();
        
        boolean resultado = sistema.procesarPago(reserva, metodoPago, 100.0);
        assertTrue(resultado);
    }
    
    
    
}
