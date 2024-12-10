package ec.edu.espol.tareaproyectodiseniosoft;

public class SoporteLegalIncidente extends ManejadorIncidente {
    @Override
    public void manejar(Incidente incidente) {
        System.out.println("Incidente resuelto por soporte legal.");
    }
}
