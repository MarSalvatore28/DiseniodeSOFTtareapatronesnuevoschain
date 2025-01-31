package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class ModeradorIncidente extends ManejadorIncidente {
    @Override
    public boolean puedeManejar(Incidente incidente) {
        return incidente.getNivelSeveridad() <= 7 && !incidente.isResuelto();
    }

    @Override
    protected void resolverIncidente(Incidente incidente) {
        System.out.println("Incidente manejado por el moderador.");
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
