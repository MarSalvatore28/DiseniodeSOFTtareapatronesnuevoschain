package ec.edu.espol.tareaproyectodiseniosoft;

public class nfitrionIncidente extends ManejadorIncidente {
    @Override
    public void manejar(Incidente incidente) {
        if (incidente.getDescripcion().contains("leve")) {
            System.out.println("Incidente resuelto por el anfitrión.");
        } else if (siguiente != null) {
            siguiente.manejar(incidente);
        }
    }
}