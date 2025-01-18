package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.time.LocalDate;
import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.EstadoUnidad;

public class CasaFactory extends UnidadFactory {
    @Override
    public Unidad crearUnidad(String id, Double precio, List<String> servicios, LocalDate fechaDisponibleDesde, LocalDate fechaDisponibleHasta) {
        // Aquí puedes agregar características predeterminadas para una casa si es necesario.
        return new Unidad(id, EstadoUnidad.DISPONIBLE, precio, servicios, fechaDisponibleDesde, fechaDisponibleHasta);
    }

}
