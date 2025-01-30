package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.util.List;

public class UnidadCaracteristicas {
    private Double precio;
    private List<String> servicios;
    public UnidadCaracteristicas(Double precio, List<String> servicios) {
        this.precio = precio;
        this.servicios = servicios;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public List<String> getServicios() {
        return servicios;
    }
    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

}
