/*
 llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package Service;

import Clase.RevolverDeAgua;


public class ServiceRevolver {
    
   RevolverDeAgua revo = new RevolverDeAgua();
    
    public RevolverDeAgua llenarRevolver(){
        
         
        
        revo.setPosicionActual((int) Math.floor(Math.random()*6+1));
        revo.setPosicionAgua((int) Math.floor(Math.random()*6+1));
        
       System.out.println(revo.getPosicionActual() +" posicion actual");
       System.out.println(revo.getPosicionAgua()  + " posicion del agua");  
       
       return revo;
    }
    
    public Boolean mojar( RevolverDeAgua rev){
        
   return (rev.getPosicionActual()== rev.getPosicionAgua());
    }
    
    public void siguienteRonda( RevolverDeAgua rev) {
        
        rev.setPosicionActual(rev.getPosicionActual()+1);
        if (rev.getPosicionActual()==6) {
            rev.setPosicionActual(1);
        }
    }
    
    public void mostras(RevolverDeAgua rev){
       
       System.out.println(rev.getPosicionActual() );
       System.out.println(rev.getPosicionAgua() );  
        
        
    }
    
}
