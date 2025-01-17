package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class ModeradorIncidente extends ManejadorIncidente {
    @Override
    public void manejar(Incidente incidente) {
        if (incidente.getDescripcion().contains("moderado")) {
            System.out.println("Incidente resuelto por el moderador.");
        } else if (siguiente != null) {
            siguiente.manejar(incidente);
        }
    }
}
