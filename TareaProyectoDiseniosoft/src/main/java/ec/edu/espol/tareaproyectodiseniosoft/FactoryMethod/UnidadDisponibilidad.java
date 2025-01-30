package ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod;

import java.time.LocalDate;

public class UnidadDisponibilidad {
        private LocalDate fechaDisponibleDesde;
    private LocalDate fechaDisponibleHasta;
    public UnidadDisponibilidad(LocalDate fechaDisponibleDesde, LocalDate fechaDisponibleHasta) {
        this.fechaDisponibleDesde = fechaDisponibleDesde;
        this.fechaDisponibleHasta = fechaDisponibleHasta;
    }
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        return !fechaInicio.isBefore(fechaDisponibleDesde) && !fechaFin.isAfter(fechaDisponibleHasta);
    }
    public LocalDate getFechaDisponibleDesde() {
        return fechaDisponibleDesde;
    }
    public void setFechaDisponibleDesde(LocalDate fechaDisponibleDesde) {
        this.fechaDisponibleDesde = fechaDisponibleDesde;
    }
    public LocalDate getFechaDisponibleHasta() {
        return fechaDisponibleHasta;
    }
    public void setFechaDisponibleHasta(LocalDate fechaDisponibleHasta) {
        this.fechaDisponibleHasta = fechaDisponibleHasta;
    }

}
