package ec.edu.espol.tareaproyectodiseniosoft;

public class TarjetaCredit implements MetodoPago {
    @Override
    public boolean procesar(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito...");
        return true; // Simular pago exitoso
    }
}
