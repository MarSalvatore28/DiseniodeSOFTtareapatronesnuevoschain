package ec.edu.espol.tareaproyectodiseniosoft.Builder;

import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.Usuario;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;

public class ApartamentoBuilder implements Builder {
     private Propiedad propiedad;

    public ApartamentoBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.propiedad = new Propiedad();
    }

    @Override
    public void setId(String id) {
        propiedad.id = id;
    }

    @Override
    public void setNombre(String nombre) {
        propiedad.nombre = nombre;
    }

    @Override
    public void setDireccion(String direccion) {
        propiedad.direccion = direccion;
    }

    @Override
    public void setReglas(List<String> reglas) {
        propiedad.reglas = reglas;
    }

    @Override
    public void setUnidades(List<Unidad> unidades) {
        propiedad.unidades = unidades;
    }

    @Override
    public void setAnfitrion(Usuario anfitrion) {
        propiedad.anfitrion = anfitrion;
    }

    @Override
    public Propiedad build() {
        Propiedad resultado = this.propiedad;
        this.reset(); // Prepara para un nuevo objeto
        return resultado;
    }

}
