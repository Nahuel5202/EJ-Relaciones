/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package relacion01;

import Clases.Perro;
import Clases.Persona;
import java.util.ArrayList;

public class Relacion01 {

   
    public static void main(String[] args) {
      
        Perro perro = new Perro();
        perro.setEdad(9);
        perro.setNombre("Roy");
        perro.setRaza("golden");
        perro.setTamanio("grande");
        
        Persona p1 = new Persona();
        
       p1.setNombre("Gaston");
       p1.setApellido("Monti");
       p1.setDocumento(45810022);
       p1.setEdad(34);
       p1.setPerro(perro);
        
       
       Perro perro2 = new Perro("mestizo","Sora","pequeño",5);
        Persona p2 = new Persona("nahuel", "lambruschini",27,45810022,perro2);
        
        ArrayList <Persona> personas = new ArrayList<>();
        
        personas.add(p1);
        personas.add(p2);
        
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
}
