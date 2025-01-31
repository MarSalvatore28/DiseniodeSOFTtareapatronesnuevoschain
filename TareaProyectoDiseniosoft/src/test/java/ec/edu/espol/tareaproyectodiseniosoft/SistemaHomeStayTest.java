/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Builder.Propiedad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.NotificadorEmail;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Observer;
import java.time.LocalDate;
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
        sistema = new SistemaHomeStay((Observer) new NotificadorEmail());
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
                LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.of(2025, 1, 30);
        Reserva reserva = sistema.crearReserva(huesped, unidad, fechaInicio, fechaFin);
        assertNotNull(reserva);
    }
    
    @Test
    void testPagoFallido() {
        Reserva reserva = new Reserva(EstadoReserva.PENDIENTE);
        MetodoPago metodo = monto -> false; // Simulación de pago fallido

        boolean resultado = sistema.procesarPago(reserva, metodo, 100.0);
        assertFalse(resultado);
    }
    
    @Test
    void testProcesarPagoExitoso() {
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.of(2025, 1, 30);
        Reserva reserva = sistema.crearReserva(huesped, unidad, fechaInicio, fechaFin);
        MetodoPago metodoPago = new TarjetaCredit();
        
        boolean resultado = sistema.procesarPago(reserva, metodoPago, 100.0);
        assertTrue(resultado);
    }
    
    
    
}
