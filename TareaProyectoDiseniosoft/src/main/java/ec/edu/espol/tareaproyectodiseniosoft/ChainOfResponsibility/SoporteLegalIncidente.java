package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class SoporteLegalIncidente extends ManejadorIncidente {
    @Override
    public boolean puedeManejar(Incidente incidente) {
        return !incidente.isResuelto();
    }
    @Override
    protected void resolverIncidente(Incidente incidente) {
        System.out.println("Incidente manejado por soporte legal.");
        incidente.setResuelto(true);
    }
    @Override
    protected void manejarIncidente(Incidente incidente){
        if (puedeManejar(incidente)) {
            resolverIncidente(incidente);
        } else {
            escalarIncidente(incidente);
        }
    }
    
}
