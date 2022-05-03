/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrarelaciones01;

/**
 *
 * @author monti
 */
public class Perro {
    
  private String raza;
    private String nombre;
    private String tamanio;
    private int edad;

    public Perro() {
    }

    public Perro(String raza, String nombre, String tamaño, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.tamanio = tamaño;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "NOMBRE : " + nombre + ", RAZA : " + raza  + ", TAMAÑO : " + tamanio + ", EDAD : " + edad ;
    }
    
    
    
    
}

