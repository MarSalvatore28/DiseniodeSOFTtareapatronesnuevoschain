
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.EmailNotificador;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author DHAMAR
 */
public class HuespedTest {
    
    private Huesped huesped;
    private SistemaHomeStay sistema;
    private Unidad unidad;
    
    @BeforeEach
    void setUp() {
        huesped = new Huesped("H001", "Juan Pérez", "juan@mail.com");
        sistema = new SistemaHomeStay(new EmailNotificador());
        unidad = new Unidad("U001", EstadoUnidad.DISPONIBLE, 100.0,
            Arrays.asList("WiFi"), LocalDate.now(), LocalDate.now().plusDays(30));
    }
    
     @Test
    void testReservaExitosa() {
        Date inicio = new Date();
        Date fin = new Date(inicio.getTime() + 86400000);
        MetodoPago metodoPago = new TarjetaCredit();
        
        huesped.realizarReserva(sistema, unidad, inicio, fin, metodoPago, 100.0);
        assertEquals(EstadoUnidad.RESERVADA, unidad.getEstado());
    }
    
    @Test
    void testReservaUnidadNoDisponible() {
        unidad.actualizarEstado(EstadoUnidad.RESERVADA);
        Date inicio = new Date();
        Date fin = new Date(inicio.getTime() + 86400000);
        MetodoPago metodoPago = new TarjetaCredit();
        
        huesped.realizarReserva(sistema, unidad, inicio, fin, metodoPago, 100.0);
        assertEquals(EstadoUnidad.RESERVADA, unidad.getEstado());
    }
}
    

