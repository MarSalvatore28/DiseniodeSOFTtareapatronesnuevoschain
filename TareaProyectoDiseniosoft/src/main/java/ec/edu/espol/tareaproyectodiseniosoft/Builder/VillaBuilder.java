package ec.edu.espol.tareaproyectodiseniosoft.Builder;

import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.Usuario;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;

public class VillaBuilder extends AbstractBuilder {
    @Override
    public void reset() {
        super.reset();
        propiedad.tipo = "Villa";  // Tipo específico para Villa
    }
}
