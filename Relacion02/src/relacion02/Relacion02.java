/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
 */
package relacion02;


import Clase.Juego;
import Clase.Jugador;
import Clase.RevolverDeAgua;
import Service.ServiceRevolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monti
 */
public class Relacion02 {

    public static void main(String[] args) {
        
        ServiceRevolver sv = new ServiceRevolver();
        RevolverDeAgua revolver = sv.llenarRevolver();
        
        
        
        System.out.println("cuantos jugadores participan?");
        
        Scanner leer = new Scanner(System.in);
        
        int cantidad = leer.nextInt();
        
        if (cantidad > 6) {
            System.out.println("por defecto seran 6");
            cantidad = 6;    
        }
        
        ArrayList<Jugador> jugadores = new ArrayList();
        
        for (int i = 0; i < cantidad; i++) {
            
            Jugador j1 = new Jugador();

            jugadores.add(j1.crearJugador(i+1));
        }
        
        Juego ruleta = new Juego(jugadores, revolver);
        
        sv.mostras(revolver);
        
        ruleta.ronda();
        
        
      

        
        
        
        
        
        
    }
   
}
