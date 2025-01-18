/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft;

import ec.edu.espol.tareaproyectodiseniosoft.Observer.Observer;

/**
 *
 * @author DHAMAR
 */
public class Anfitrion extends Usuario implements Observer{
    public Anfitrion(String id, String nombre, String email) {
        super(id, nombre, email);
    }

    // Sobrescribe el método de notificación para personalizar el mensaje
    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para el Anfitrión " + getNombre() + " (" + getEmail() + "): " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        recibirNotificacion(mensaje);
    }
    
}
