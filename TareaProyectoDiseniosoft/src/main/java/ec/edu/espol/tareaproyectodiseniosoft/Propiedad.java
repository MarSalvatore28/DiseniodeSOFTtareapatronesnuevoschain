package ec.edu.espol.tareaproyectodiseniosoft;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private List<Unidad> unidades;

    public List<Unidad> verificarDisponibilidad() {
        List<Unidad> disponibles = new ArrayList<>();
        for (Unidad unidad : unidades) {
            if (unidad.getEstado() == EstadoUnidad.DISPONIBLE) {
                disponibles.add(unidad);
            }
        }
        return disponibles;
    }
}
