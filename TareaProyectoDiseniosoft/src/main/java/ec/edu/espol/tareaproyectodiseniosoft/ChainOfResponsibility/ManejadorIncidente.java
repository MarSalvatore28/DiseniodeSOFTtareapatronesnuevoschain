package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public abstract class ManejadorIncidente {
    protected ManejadorIncidente siguiente;

    public void setSiguiente(ManejadorIncidente siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejar(Incidente incidente);
}
