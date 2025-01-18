package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class ModeradorIncidente extends ManejadorIncidente {
    
    @Override
    public void manejarIncidente(Incidente incidente) {
        if (incidente.getNivelSeveridad() <= 7 && !incidente.isResuelto()) {
            System.out.println("Incidente manejado por el moderador.");
            incidente.setResuelto(true);
        } else {
            System.out.println("El moderador no pudo manejar el incidente. Escalando...");
            escalarIncidente(incidente);
        }
    }
}
