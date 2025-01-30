package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Builder.Propiedad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class SistemaHomeStay {
     private Observer notificador;

    public SistemaHomeStay() {
    }

    public SistemaHomeStay(Observer notificador) {
        this.notificador = notificador;
    }

    public List<Propiedad> buscarPropiedades(String filtro) {
        System.out.println("Buscando propiedades con filtro: " + filtro);
        return new ArrayList<>();
    }
    
    public Reserva realizarReserva(Huesped huesped, Unidad unidad, Date fechaInicio, Date fechaFin, MetodoPago metodo, double monto) {
        if (unidad.getEstado() == EstadoUnidad.DISPONIBLE) {
            Reserva reserva = crearReserva(huesped, unidad, fechaInicio, fechaFin);
            unidad.actualizarEstado(EstadoUnidad.RESERVADA);
            procesarPago(reserva, metodo, monto);
            return reserva;
        } else {
            System.out.println("Unidad no disponible.");
            return null;
        }
    }


    public Reserva crearReserva(Huesped huesped, Unidad unidad, java.util.Date fechaInicio, java.util.Date fechaFin) {
        System.out.println("Creando reserva para el huésped: " + huesped.getNombre());
        return new Reserva(huesped, unidad, fechaInicio, fechaFin);
    }

    public boolean procesarPago(Reserva reserva, MetodoPago metodo, double monto) {
        System.out.println("Procesando pago...");
        boolean resultado = metodo.procesar(monto);
        if (resultado) {
           // reserva.setEstado(EstadoPago.COMPLETO);
            notificador.actualizar(""+reserva.getHuesped().getEmail()+ "Pago completado.");
        } else {
            //reserva.setEstado(EstadoPago.FALLIDO);
            notificador.actualizar(reserva.getHuesped().getEmail()+",Pago fallido.");
        }
        return resultado;
    }


}
