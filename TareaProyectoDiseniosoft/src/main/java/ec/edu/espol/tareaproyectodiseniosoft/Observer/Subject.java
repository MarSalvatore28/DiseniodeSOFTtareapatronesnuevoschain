package ec.edu.espol.tareaproyectodiseniosoft.Observer;

import java.util.Observer;

public interface Subject {
    void agregarObserver(Observer observer);
    void quitarObserver(Observer observer);
    void notificarObservers(String mensaje);

}
