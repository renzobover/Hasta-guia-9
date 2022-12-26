/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ej_2_javacollections_guia8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Ej_2_JavaCollections_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
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
            if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                do {
                    System.out.println("Ingrese una opcion correcta: ");
                    opcion = leer.next();
                } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
            }
        }

        System.out.println("-----------------------------");

        Iterator<String> itRaza = perros.iterator();
        System.out.print("Ingrese una raza de perro para eliminarla de la lista: ");
        String raza2 = leer.next();
        boolean vof = false;
        
        while (itRaza.hasNext()) {
            if (itRaza.next().equalsIgnoreCase(raza2)) {
                itRaza.remove();
                vof = true;
            } 
        }

        if (vof = true) {
            System.out.println("La raza estaba en la lista.");
            System.out.println("Estos son los perros que quedaron en la lista...");
            for (String aux : perros) {
                System.out.println(aux);
            }
        } else {
            System.out.println("La raza no estaba en la lista y fue removido: ");
            System.out.println("Estos son los perros que quedaron en la lista...");
            for (String aux : perros) {
                System.out.println(aux);
            }
        }

    }

    }

