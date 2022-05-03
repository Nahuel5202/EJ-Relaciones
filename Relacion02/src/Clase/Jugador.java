/*
 Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.


disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a true, sino false.
 */
package Clase;

import Service.ServiceRevolver;
import java.util.Scanner;



/**
 *
 * @author monti
 */
public class Jugador {
    
    private int iD;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(int iD, String nombre,  Boolean mojado) {
        this.iD = iD;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "iD=" + iD + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    ServiceRevolver sv = new ServiceRevolver();
    
    public Jugador crearJugador(int id){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el jugador");
        
        String nombre = leer.next();
        
        Jugador jugador = new Jugador (id,nombre,false);
        
        return jugador;
    }
    
    public boolean disparo(RevolverDeAgua T){
        
       sv.mostras(T);
        if (sv.mojar(T)) {
            System.out.println("Mojado!");
           mojado = true; 
           return true;
        }else  {
        sv.siguienteRonda(T);
        return false;
        } 
            
        
    }    
    
}
