package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.time.LocalDate;
import java.util.List;

public abstract class UnidadFactory {
    public abstract Unidad crearUnidad(String id, Double precio, List<String> servicios, LocalDate fechaDisponibleDesde, LocalDate fechaDisponibleHasta);

}
