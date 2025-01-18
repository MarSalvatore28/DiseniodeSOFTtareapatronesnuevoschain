package ec.edu.espol.tareaproyectodiseniosoft.Builder;

import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.Usuario;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;

public interface Builder {
    void reset();
    void setId(String id);
    void setNombre(String nombre);
    void setDireccion(String direccion);
    void setReglas(List<String> reglas);
    void setUnidades(List<Unidad> unidades);
    void setAnfitrion(Usuario anfitrion);
    Propiedad build();

}
