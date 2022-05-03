/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/
package extrarelaciones01;

import java.util.ArrayList;

public class Service {

    public ArrayList<Perro>  perros() {

        ArrayList<Perro> perreke = new ArrayList();

        Perro sora = new Perro("mestizo", "Sora", "pequeño", 5);
        Perro matilda = new Perro("mestizo", "matilda", "grande", 8);
        Perro lola = new Perro("mestizo", "lola", "mediano", 3);
        Perro lia = new Perro("bulldog", "lia", "pequeño", 1);
        Perro roy = new Perro("golden", "Roy", "grande", 9);
        Perro neir = new Perro("labrador", "Neir", "grande", 8);
        Perro choco = new Perro("mestizo", "choco", "pequeño", 3);
        
        perreke.add(sora);
        perreke.add(matilda);
        perreke.add(lola);
        perreke.add(lia);
        perreke.add(roy);
        perreke.add(neir);
        perreke.add(choco);

       // System.out.println("\t---Lista de perros---");
            int a=0;
        for (Perro perro1 : perreke) {
            
           System.out.println( perreke.get(a).getNombre());
           a++;
        }
       return perreke; 
    }

    public ArrayList<Persona> persona(String nom, String apell, int dni, int edad) {

        ArrayList<Persona> personas = new ArrayList();
      
       
        
        Persona persona = new Persona(nom, apell, dni, edad,null);

        personas.add(persona);

        return personas;
    }

  

    
   
}
