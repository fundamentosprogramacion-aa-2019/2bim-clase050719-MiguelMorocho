/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;
/**
 *
 * @author INSPIRON
 */
public class Persona {
    private String genero;
    private int edad;
    private String nombre;
    
 //Metodos get y set para estos atributos
    public void establecerGenero(String g) {//set
        genero = g;
    }
     public String obtenerGenero() { //get
    return genero;
    }
    public void establecerEdad(int g) {
        edad = g;
    }
    public int obtenerEdad() {
    return edad;
    }
    public void establecerNombre(String g) {
        nombre = g;
    }
      public String obtenerNombre() {
    return nombre;
    }    
}
 
  