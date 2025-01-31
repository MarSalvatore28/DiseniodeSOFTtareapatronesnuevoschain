package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public class AnfitrionIncidente extends ManejadorIncidente {
    @Override
    public boolean puedeManejar(Incidente incidente) {
        return incidente.getNivelSeveridad() <= 3 && !incidente.isResuelto();
    }
    @Override
    protected void resolverIncidente(Incidente incidente) {
        System.out.println("Incidente manejado por el anfitrión.");
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

