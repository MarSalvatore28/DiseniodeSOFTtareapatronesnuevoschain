package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class SoporteLegalIncidente extends ManejadorIncidente {
    @Override
    public void manejarIncidente(Incidente incidente) {
        if (!incidente.isResuelto()) {
            System.out.println("Incidente manejado por soporte legal.");
            incidente.setResuelto(true);
        } else {
            System.out.println("Soporte legal no pudo manejar el incidente. Escalando...");
            escalarIncidente(incidente);
        }
    }

    
}
