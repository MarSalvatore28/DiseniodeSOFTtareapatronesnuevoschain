/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tareaproyectodiseniosoft;

/**
 *
 * @author marsa
 */
public class Main {
    public static void main(String[] args) {
        Notificador notificador = new EmailNotificador();
        SistemaHomeStay sistema = new SistemaHomeStay(notificador);

        Huesped huesped = new Huesped();
        Unidad unidad = new Unidad();
        unidad.actualizarEstado(EstadoUnidad.DISPONIBLE);

        MetodoPago metodo = new TarjetaCredit();
        huesped.realizarReserva(sistema, unidad, new Date(), new Date(), metodo, 500.0);

        // Configurar chain de incidentes
        ManejadorIncidente anfitrion = new nfitrionIncidente();
        ManejadorIncidente moderador = new ModeradorIncidente();
        ManejadorIncidente soporteLegal = new SoporteLegalIncidente();

        anfitrion.setSiguiente(moderador);
        moderador.setSiguiente(soporteLegal);

        // Reportar incidente
        huesped.reportarIncidente("Incidente moderado", anfitrion);
    }
}