/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espol.tareaproyectodiseniosoft;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ManejadorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.AnfitrionIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ModeradorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.SoporteLegalIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.Propiedad;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.ApartamentoBuilder;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.CasaBuilder;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.VillaBuilder;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.DirectorPropiedad;
import ec.edu.espol.tareaproyectodiseniosoft.Builder.Builder;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.EmailNotificador;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ManejadorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.ModeradorIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.SoporteLegalIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.ChainOfResponsibility.AnfitrionIncidente;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.CasaFactory;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.DepartamentoFactory;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.HabitacionPrivadaFactory;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadData;
import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.UnidadFactory;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.NotificadorAppMensajeria;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.NotificadorEmail;
import ec.edu.espol.tareaproyectodiseniosoft.Observer.NotificadorSMS;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marsa
 */
public class Main {

    public static void main(String[] args) {
        
        //builder
        DirectorPropiedad director = new DirectorPropiedad();

        // Crear los builders
        Builder apartamentoBuilder = new ApartamentoBuilder();
        Builder casaBuilder = new CasaBuilder();
        Builder villaBuilder = new VillaBuilder();

        // Construir y mostrar un apartamento
        director.construirApartamento((ApartamentoBuilder) apartamentoBuilder);
        Propiedad apartamento = apartamentoBuilder.build();
        System.out.println("Apartamento creado: " + apartamento.getNombre() + " en " + apartamento.getDireccion());

        // Construir y mostrar una casa
        director.construirCasa((CasaBuilder) casaBuilder);
        Propiedad casa = casaBuilder.build();
        System.out.println("Casa creada: " + casa.getNombre() + " en " + casa.getDireccion());

        // Construir y mostrar una villa
        director.construirVilla((VillaBuilder) villaBuilder);
        Propiedad villa = villaBuilder.build();
        System.out.println("Villa creada: " + villa.getNombre() + " en " + villa.getDireccion());

        
        
       
        //chain 
        
        ManejadorIncidente anfitrion = new AnfitrionIncidente();
        ManejadorIncidente moderador = new ModeradorIncidente();
        ManejadorIncidente soporteLegal = new SoporteLegalIncidente();

        // Establecer la cadena de responsabilidad
        anfitrion.establecerSiguiente(moderador);  // Si el anfitrión no puede manejarlo, pasa al moderador
        moderador.establecerSiguiente(soporteLegal);  // Si el moderador no puede manejarlo, pasa a soporte legal

        // Crear un incidente con un nivel de severidad 5 (puede ser manejado por el moderador)
        Incidente incidente1 = new Incidente(5);

        // Manejar el incidente a través de la cadena
        System.out.println("Manejando incidente con nivel de severidad 5:");
        anfitrion.manejarIncidente(incidente1);  // Inicia con el anfitrión
        
        // Crear un incidente con un nivel de severidad 9 (necesita escalar hasta soporte legal)
        Incidente incidente2 = new Incidente(9);

        // Manejar el incidente a través de la cadena
        System.out.println("\nManejando incidente con nivel de severidad 9:");
        anfitrion.manejarIncidente(incidente2);  // Inicia con el anfitrión
        
        
        
        
        
        
        //factory
        UnidadFactory habitacionFactory = new HabitacionPrivadaFactory();
        UnidadData parametros = new UnidadData("H001",100.0, List.of("WiFi", "TV"),LocalDate.now(), LocalDate.now().plusDays(5));

        Unidad habitacion = habitacionFactory.crearUnidad(parametros);

        UnidadFactory departamentoFactory = new DepartamentoFactory();
        UnidadData parametros1 = new UnidadData("D001", 200.0, List.of("WiFi", "Cocina"), LocalDate.now(), LocalDate.now().plusDays(10));
        Unidad departamento = departamentoFactory.crearUnidad(parametros1);

        UnidadFactory casaFactory = new CasaFactory();
        UnidadData parametros2 = new UnidadData("C001", 300.0, List.of("WiFi", "Jardín", "Piscina"), LocalDate.now(), LocalDate.now().plusDays(15));
        Unidad casa1 = casaFactory.crearUnidad(parametros2);

        
        
        
        // observer 
        Reserva reserva = new Reserva(EstadoReserva.PENDIENTE);

        //notificadores al fin 
        NotificadorSMS notificadorSMS = new NotificadorSMS();
        NotificadorEmail notificadorEmail = new NotificadorEmail();
        NotificadorAppMensajeria notificadorApp = new NotificadorAppMensajeria();

        // agregando notificadores 
        reserva.agregarObserver(notificadorSMS);
        reserva.agregarObserver(notificadorEmail);
        reserva.agregarObserver(notificadorApp);

        // Cambiar el estado de la reserva (esto notificará a todos los observadores)
        reserva.cambiarEstado(EstadoReserva.CONFIRMADA);

        // Cambiar el estado de la reserva a "FINALIZADA" (notificación para todos los observadores nuevamente)
        reserva.cambiarEstado(EstadoReserva.FINALIZADA);
    }
}
