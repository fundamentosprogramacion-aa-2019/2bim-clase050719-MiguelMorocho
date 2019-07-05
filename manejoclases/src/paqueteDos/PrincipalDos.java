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
public class PrincipalDos {
    public static void main (String[] args){
        Persona personaUno = new Persona();
        personaUno.establecerNombre("Jhon");
        personaUno.establecerGenero("Masculino");
        personaUno.establecerEdad(22);
        
         System.out.printf("Nombre: %s - Edad: %d - Género: %s\n",
                personaUno.obtenerNombre(), personaUno.obtenerEdad(),
                personaUno.obtenerGenero());
        
    }
}
