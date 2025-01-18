package ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility;

import ec.edu.espol.tareaproyectodiseniosoft.Incidente;

public abstract class ManejadorIncidente {
    protected ManejadorIncidente siguiente;

    public void establecerSiguiente(ManejadorIncidente siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarIncidente(Incidente incidente);

}
