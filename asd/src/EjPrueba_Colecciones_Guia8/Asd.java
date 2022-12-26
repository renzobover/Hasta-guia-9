/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package EjPrueba_Colecciones_Guia8;

import Atributos.Objetos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author renzo
 */
public class Asd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Listas------------------");
        List<Integer> listado = new ArrayList();
        listado.add(10);
        listado.add(20);
        listado.add(32);
        listado.add(22);
        listado.add(21);
        //listado.remove(1); //En listas se remueve manualmente con el indice, no con el valor.

        Iterator<Integer> ite = listado.iterator();
        while (ite.hasNext()) {
            if (ite.next() == 20) { //Con el iterador se remueve con el valor, no con el indice.
                ite.remove();
            }
        }

        Collections.sort(listado); //Para ordenar listas
        for (Integer aux : listado) { //Recorrer listas con un for each
            System.out.println(aux);
        }

        System.out.println("");

        System.out.println("Conjuntos----------------");
        HashSet<String> arbol = new HashSet();
        arbol.add("palabra");
        arbol.add("bocon");
        arbol.add("imaginate");
        arbol.add("alegria");
        arbol.add("arbol");
        //arbol.remove("imaginate"); //Remover directamente

        Iterator it = arbol.iterator(); //Creamos el objeto iterator sobre el conjunto arbol.
        while (it.hasNext()) { //hasNext devuelve true si hay un elemento mas a iterar.
            if (it.next().equals("imaginate")) {
                it.remove();
            }
            //System.out.println(it.next() + " "); //it.next() es para mostrar, pero tira error si eliminamos a la vez.
        }
        ArrayList<String> arbolOrdenado = new ArrayList(arbol); //Para ordenar un conjunto primero hay que transformarlo en lista.
        Collections.sort(arbolOrdenado);
        for (String aux : arbolOrdenado) { //Recorrer conjuntos con un for each.
            System.out.println(aux);
        }

        System.out.println("Mapas--------------------");
        TreeMap<Integer, String> personas = new TreeMap();
        personas.put(40423849, "nombre");
        personas.put(40423840, "nombre");
        personas.put(40423832, "nombre");
        personas.put(40433849, "nombre");
        personas.remove(40423840);
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key " + key + " - " + "value " + value);
        }

        int num1 = 10;
        int num2 = 20;
        Objetos nums = new Objetos(num1, num2);
        ArrayList<Objetos> numeros = new ArrayList();
        numeros.add(nums);
        System.out.println(nums);

    }

}
