package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public abstract class ManejadorIncidente {
    protected ManejadorIncidente siguiente;

    public void establecerSiguiente(ManejadorIncidente siguiente) {
        this.siguiente = siguiente;
    }
    public abstract boolean puedeManejar(Incidente incidente);

    public abstract void manejarIncidente(Incidente incidente);
    
    
    protected void escalarIncidente(Incidente incidente) {
        if (siguiente != null) {
            siguiente.manejarIncidente(incidente);
        } else {
            System.out.println("Nadie pudo resolver el incidente. Escalando a soporte externo.");
        }
    }
    protected abstract void resolverIncidente(Incidente incidente);
}
