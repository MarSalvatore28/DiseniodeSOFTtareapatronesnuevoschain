package ec.edu.espol.tareaproyectodiseniosoft.Builder;

import java.util.List;

import ec.edu.espol.tareaproyectodiseniosoft.Usuario;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;

public class DirectorPropiedad {
    public void construirApartamento(ApartamentoBuilder builder) {
        builder.reset();
        builder.setId("AP001");
        builder.setNombre("Apartamento Lujo");
        builder.setDireccion("Calle Principal #123");
        builder.setReglas(List.of("No fumar", "No mascotas"));
        builder.setUnidades(List.of(new Unidad("U001"), new Unidad("U002")));
        builder.setAnfitrion(new Usuario("ANF001", "Juan Pérez"));
    }
    public void construirVilla(VillaBuilder builder) {
        builder.reset();
        builder.setId("VL001");
        builder.setNombre("Villa de Campo");
        builder.setDireccion("Avenida Bosque #456");
        builder.setReglas(List.of("Solo adultos", "No fiestas grandes"));
        builder.setUnidades(List.of(new Unidad("V001")));
        builder.setAnfitrion(new Usuario("ANF002", "Carlos López"));
    }
    public void construirCasa(CasaBuilder builder) {
        builder.reset();
        builder.setId("CS001");
        builder.setNombre("Casa Familiar");
        builder.setDireccion("Calle Jardín #789");
        builder.setReglas(List.of("Respetar vecinos", "No fiestas después de las 10 PM"));
        builder.setUnidades(List.of(new Unidad("C001"), new Unidad("C002"), new Unidad("C003")));
        builder.setAnfitrion(new Usuario("ANF003", "Sofía Gómez"));
    }
}

