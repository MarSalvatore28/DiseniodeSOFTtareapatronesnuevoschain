package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class ModeradorIncidente extends ManejadorIncidente {
    
     @Override
    public void manejarIncidente(Incidente incidente) {
        if (incidente.isResuelto()) {
            return; // Si ya está resuelto, no procesar
        }
        if (incidente.getNivelSeveridad() <= 7) {
            System.out.println("Incidente manejado por el moderador: " + incidente.getDescripcion());
            incidente.setResuelto(true);
        } else if (siguiente != null) {
            siguiente.manejarIncidente(incidente);
        }
    }
}
