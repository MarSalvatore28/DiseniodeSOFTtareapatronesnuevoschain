package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.time.LocalDate;
import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoUnidad;

public class DepartamentoFactory extends UnidadFactory {

    @Override
    public Unidad crearUnidad(UnidadData data) {
        UnidadCaracteristicas caracteristicas = new UnidadCaracteristicas(data.getPrecio(), data.getServicios());
        UnidadDisponibilidad disponibilidad = new UnidadDisponibilidad(data.getFechaDisponibleDesde(), data.getFechaDisponibleHasta());
        return new Unidad(data.getId(), EstadoUnidad.DISPONIBLE, disponibilidad, caracteristicas);
    }
}
