package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.time.LocalDate;
import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoUnidad;

public class DepartamentoFactory extends UnidadFactory {

    @Override
    public Unidad crearUnidad(String id, Double precio, List<String> servicios, LocalDate fechaDisponibleDesde, LocalDate fechaDisponibleHasta) {
        UnidadCaracteristicas caracteristicas = new UnidadCaracteristicas(precio, servicios);
        UnidadDisponibilidad disponibilidad = new UnidadDisponibilidad(fechaDisponibleDesde, fechaDisponibleHasta);
        return new Unidad(id, EstadoUnidad.DISPONIBLE, disponibilidad, caracteristicas);
    }
}

