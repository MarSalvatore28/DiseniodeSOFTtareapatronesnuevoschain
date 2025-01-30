package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class UnidadData {
    private String id;
    private Double precio;
    private List<String> servicios;
    private LocalDate fechaDisponibleDesde;
    private LocalDate fechaDisponibleHasta;

    public UnidadData(String id, Double precio, List<String> servicios, LocalDate fechaDisponibleDesde, LocalDate fechaDisponibleHasta) {
        this.id = id;
        this.precio = precio;
        this.servicios = servicios;
        this.fechaDisponibleDesde = fechaDisponibleDesde;
        this.fechaDisponibleHasta = fechaDisponibleHasta;
    }

    public String getId() {
        return id;
    }

    public Double getPrecio() {
        return precio;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public LocalDate getFechaDisponibleDesde() {
        return fechaDisponibleDesde;
    }

    public LocalDate getFechaDisponibleHasta() {
        return fechaDisponibleHasta;
    }
}

