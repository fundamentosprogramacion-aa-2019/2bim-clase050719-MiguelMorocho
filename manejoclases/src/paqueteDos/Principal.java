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
public class Principal {
    public static void main (String[] args){
        
        //Persona p;
        //p = new Persona();
        Persona p = new Persona();
        Persona persona2 = new Persona();
        
        System.out.printf("Nombre: %s - Edad: %d - Género: %s\n",
                p.obtenerNombre(), p.obtenerEdad(), p.obtenerGenero());
                
        
        System.out.println("----------o----------");
       
        //p.nombre = "Miguel";
        p.establecerNombre("Miguel");
        //p.genero = "Masculino";
        p.establecerGenero("Masculino");
        //p.edad = 20;
        p.establecerEdad(20);
        
        System.out.printf("Nombre: %s - Edad: %d - Género: %s\n",
                p.obtenerNombre(), p.obtenerEdad(), p.obtenerGenero());
    }
}
