package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Observer.Notificador;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.Propiedad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class SistemaHomeStay {
     private Notificador notificador;

    public SistemaHomeStay(Notificador notificador) {
        this.notificador = notificador;
    }

    public List<Propiedad> buscarPropiedades(String filtro) {
        System.out.println("Buscando propiedades con filtro: " + filtro);
        return new ArrayList<>();
    }

    public Reserva crearReserva(Huesped huesped, Unidad unidad, java.util.Date fechaInicio, java.util.Date fechaFin) {
        System.out.println("Creando reserva para el huésped: " + huesped.getNombre());
        return new Reserva(huesped, unidad, fechaInicio, fechaFin);
    }

    public boolean procesarPago(Reserva reserva, MetodoPago metodo, double monto) {
        System.out.println("Procesando pago...");
        boolean resultado = metodo.procesar(monto);
        if (resultado) {
            reserva.setEstado(EstadoPago.COMPLETO);
            notificador.enviarNotificacion(reserva.getHuesped().getEmail(), "Pago completado.");
        } else {
            reserva.setEstado(EstadoPago.FALLIDO);
            notificador.enviarNotificacion(reserva.getHuesped().getEmail(), "Pago fallido.");
        }
        return resultado;
    }


}
