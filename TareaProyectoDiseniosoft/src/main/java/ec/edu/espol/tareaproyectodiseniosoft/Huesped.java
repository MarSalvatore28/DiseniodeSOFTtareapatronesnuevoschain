package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ManejadorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadCaracteristicas;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadDisponibilidad;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Observer;

import java.util.Date;

public class Huesped extends Usuario implements Observer {
    SistemaHomeStay sistema = new SistemaHomeStay();
    
    public Huesped(String id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void reportarIncidente(String descripcion, ManejadorIncidente manejadorInicial, int nivelSeveridad) {
    // Crear un nuevo incidente con los datos proporcionados
    Incidente incidente = new Incidente(descripcion, nivelSeveridad);

    // Pasar el incidente al manejador inicial
    manejadorInicial.manejarIncidente(incidente);

    // Verificar si el incidente fue resuelto y reportar el estado
    if (incidente.isResuelto()) {
        System.out.println("El incidente fue resuelto exitosamente.");
    } else {
        System.out.println("El incidente no pudo ser resuelto.");
    }
}

    public void solicitarReserva(Huesped huesped, Unidad unidad, UnidadDisponibilidad tiempo, UnidadCaracteristicas caract, MetodoPago metodo) {
        sistema.realizarReserva(huesped, unidad, tiempo.getFechaDisponibleDesde(), tiempo.getFechaDisponibleHasta(), metodo, caract.getPrecio());
    }

    // Sobrescribe el método de notificación para personalizar el mensaje
    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para el Huesped " + getNombre() + " (" + getEmail() + "): " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        recibirNotificacion(mensaje);
    }
}

