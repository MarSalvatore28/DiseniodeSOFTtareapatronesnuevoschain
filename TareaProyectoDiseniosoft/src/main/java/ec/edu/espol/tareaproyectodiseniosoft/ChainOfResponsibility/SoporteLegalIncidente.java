package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class SoporteLegalIncidente extends ManejadorIncidente {
    @Override
    public void manejar(Incidente incidente) {
        System.out.println("Incidente resuelto por soporte legal.");
    }
}
