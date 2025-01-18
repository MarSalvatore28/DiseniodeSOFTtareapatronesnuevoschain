package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class SoporteLegalIncidente extends ManejadorIncidente {
    @Override
    public void manejarIncidente(Incidente incidente) {
        if (incidente.isResuelto()) {
            return; // Si ya está resuelto, no procesar
        }
        System.out.println("Incidente manejado por soporte legal: " + incidente.getDescripcion());
        incidente.setResuelto(true);
    }

    
}
