/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Observer.EmailNotificador;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.Notificador;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ManejadorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ModeradorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.SoporteLegalIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.AnfitrionIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author marsa
 */
public class Main {
    public static void main(String[] args) {
        ManejadorIncidente anfitrion = new AnfitrionIncidente();
        ManejadorIncidente moderador = new ModeradorIncidente();
        ManejadorIncidente soporteLegal = new SoporteLegalIncidente();

        anfitrion.establecerSiguiente(moderador);
        moderador.establecerSiguiente(soporteLegal);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Gestión de Incidentes ===");

        while (true) {
            System.out.print("\nIngrese la descripción del incidente: ");
            String descripcion = scanner.nextLine();

            System.out.print("Ingrese el nivel de severidad del incidente (1-10): ");
            int nivelSeveridad = Integer.parseInt(scanner.nextLine());

            Incidente incidente = new Incidente(descripcion, nivelSeveridad);
            System.out.println("\nProcesando incidente...");
            anfitrion.manejarIncidente(incidente);

            System.out.println("\nEstado del Incidente:");
            imprimirEstado(incidente);

            System.out.print("\n¿Desea reportar otro incidente? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }

    private static void imprimirEstado(Incidente incidente) {
        System.out.println("ID: " + incidente.getId());
        System.out.println("Descripción: " + incidente.getDescripcion());
        System.out.println("Nivel de Severidad: " + incidente.getNivelSeveridad());
        System.out.println("Estado: " + (incidente.isResuelto() ? "Resuelto" : "Pendiente"));
    }
}