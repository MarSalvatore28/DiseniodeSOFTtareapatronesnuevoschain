package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class AnfitrionIncidente extends ManejadorIncidente {
    @Override
    public void manejarIncidente(Incidente incidente) {
        if (incidente.getNivelSeveridad() <= 3 && !incidente.isResuelto()) {
            System.out.println("Incidente manejado por el anfitrión.");
            incidente.setResuelto(true);
        } else {
            System.out.println("El anfitrión no pudo manejar el incidente. Escalando...");
            escalarIncidente(incidente);
        }
    }
}