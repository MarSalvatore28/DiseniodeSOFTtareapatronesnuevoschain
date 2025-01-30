package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.time.LocalDate;
import java.util.List;

public abstract class UnidadFactory {
    public abstract Unidad crearUnidad(UnidadData data);
}

