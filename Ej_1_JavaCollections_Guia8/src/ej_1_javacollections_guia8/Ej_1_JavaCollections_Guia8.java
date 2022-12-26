/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ej_1_javacollections_guia8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Ej_1_JavaCollections_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();

        String opcion = "";
        while (!"n".equalsIgnoreCase(opcion)) {
            System.out.println("-----------------------------");
            System.out.print("Ingrese una raza: ");
            String raza = leer.next();
            perros.add(raza);
            System.out.println("Desea agregar otra raza de perro a la lista? ");
            System.out.println("S/N");
            opcion = leer.next();
            
        }
        
        for (String aux : perros) {
            System.out.println(aux);
        }

    }

}
