/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import Atributos.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author renzo
 */
public class paisesServicios {
    
    private TreeSet<String> setAuxPaises; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    public paisesServicios() {
        this.setAuxPaises = new TreeSet<>(); // Creo el espacio en memoria del CONJUNTO(SET)
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    Paises pa = new Paises();
    
    public void agregarPaises(){
    
        String opcion = null;
        do {
            System.out.print("Ingrese un pais: ");
            String p = leer.next();
            setAuxPaises.add(p);
            pa.setSetPais(setAuxPaises);
            System.out.println("¿Desea agregar un nuevo pais?");
            System.out.println("S/N");
            opcion = leer.next();
            if (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                do {
                    System.out.println("Ingrese una opcion valida: ");
                    opcion = leer.nextLine();
                } while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n"));
            }
        } while (opcion.equalsIgnoreCase("s"));
        
        System.out.println("Lista de paises ordenados alfabeticamente--------------------------------------");
        for (String aux : setAuxPaises) {
            System.out.println(aux);
        }
        
    }
    
    public void eliminarPais(){
    Iterator<String> itPaises = pa.getSetPais().iterator();
        System.out.println("Ingrese el nombre de un pais a eliminar: ");
        boolean vof = false;
        String p = leer.next();
        while (itPaises.hasNext()) {            
            if (itPaises.next().equalsIgnoreCase(p)) {
                itPaises.remove();
                vof = true;
            }
        }
        
        if (vof == true) {
            System.out.println("Se encontro el pais a eliminar. La lista de paises quedo de esta forma: ");
            for (String aux : setAuxPaises) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No se encontro el pais a eliminar.");}
    }
    
    
}
