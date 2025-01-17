package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class AnfitrionIncidente extends ManejadorIncidente {
    @Override
    public void manejar(Incidente incidente) {
        if (incidente.getDescripcion().contains("leve")) {
            System.out.println("Incidente resuelto por el anfitrión.");
        } else if (siguiente != null) {
            siguiente.manejar(incidente);
        }
    }
}