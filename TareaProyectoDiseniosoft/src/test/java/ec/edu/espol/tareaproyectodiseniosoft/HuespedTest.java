
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadCaracteristicas;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadDisponibilidad;
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
    UnidadDisponibilidad fechas;
    private Huesped huesped;
    private SistemaHomeStay sistema;
    private Unidad unidad;
     UnidadCaracteristicas datos ;
    
    @BeforeEach
    void setUp() {
        huesped = new Huesped("H001", "Juan Pérez", "juan@mail.com");
        sistema = new SistemaHomeStay(new EmailNotificador());
        fechas = new UnidadDisponibilidad(LocalDate.now(), 
            LocalDate.now().plusDays(30));
        datos = new UnidadCaracteristicas(200.0, Arrays.asList("WiFi", "TV"));
        unidad = new Unidad("U001", EstadoUnidad.DISPONIBLE, fechas,datos);
    }
    
     @Test
    void testReservaExitosa() {
        Date inicio = new Date();
        Date fin = new Date(inicio.getTime() + 86400000);
        MetodoPago metodoPago = new TarjetaCredit();
        
        huesped.solicitarReserva(huesped, unidad, fechas,datos,metodoPago);
        assertEquals(EstadoUnidad.RESERVADA, unidad.getEstado());
    }
    
    @Test
    void testReservaUnidadNoDisponible() {
        unidad.actualizarEstado(EstadoUnidad.RESERVADA);
        Date inicio = new Date();
        Date fin = new Date(inicio.getTime() + 86400000);
        MetodoPago metodoPago = new TarjetaCredit();
        
        huesped.solicitarReserva(huesped, unidad,fechas,datos, metodoPago );
        assertEquals(EstadoUnidad.RESERVADA, unidad.getEstado());
    }
}
    

