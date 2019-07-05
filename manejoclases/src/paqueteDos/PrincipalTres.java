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
public class PrincipalTres {

    public static void main(String[] args) {
        /*
            int [] lista = new int [3];
            String [] lista2 = new String [3];
            double [] lista3 = new double [3];
         */
        Persona[] lista4 = new Persona[3];
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        int suma = 0;
        double promedioE = 0;

        persona1.establecerNombre("Denis");
        persona2.establecerNombre("Carlos");
        persona3.establecerNombre("Miguel");

        persona1.establecerEdad(19);
        persona2.establecerEdad(20);
        persona3.establecerEdad(21);

        persona1.establecerGenero("Masculino");
        persona2.establecerGenero("Masculino");
        persona3.establecerGenero("Masculino");

        lista4[0] = persona1;
        lista4[1] = persona2;
        lista4[2] = persona3;

        for (int i = 0; i < lista4.length; i++) {
            Persona p = lista4[i];
            suma = suma + p.obtenerEdad();

            System.out.printf("Nombre: %s - %s\n",
                   p.obtenerNombre(), p.obtenerGenero());

        }
        promedioE = suma / lista4.length;
        System.out.printf("Promedio de edades: %.2f", promedioE);
    }
}
