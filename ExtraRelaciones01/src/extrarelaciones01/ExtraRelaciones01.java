/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package extrarelaciones01;

import java.util.Scanner;


public class ExtraRelaciones01 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Service sv = new Service();
        
        sv.perros();
        
        
        System.out.println("______________________________________________________");
        System.out.println("\t ---ingrese los datos del adoptante--- ");
        System.out.println("______________________________________________________");
        
        System.out.println("nombre: ");
        String nombre = leer.nextLine();
        System.out.println("apellido: ");
        String apellido = leer.nextLine();
        System.out.println("su dni :");
        int dni = leer.nextInt();
        System.out.println("su edad: ");
        int edad = leer.nextInt();
        
       
      
        System.out.println(" que perro desea adoptar?");
        String perro = leer.next();
        
   
      sv.persona(nombre,apellido,dni,edad);
        
       
    }
    
}
