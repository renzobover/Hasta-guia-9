/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package Servicios;

import Atributos.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class serviciosAhorcado {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ah = new Ahorcado();
    String letra;

    public Ahorcado crearJuego(Scanner leer) {
        
        System.out.print("Ingrese la palabra a adivinar: ");
        String palabra = leer.next(); //Ingresamos en una variable la palabra a encontrar.
        System.out.print("Ingrese la cantidad de intentos posibles: ");
        int intentos; 
        intentos = leer.nextInt(); //Ingresamos en una variable la cantidad de intentos posibles

        int longitud = palabra.length(); //Sacamos la longitud de la palabra para saber la longitud del vector.

        String[] aux = new String[longitud]; //Creamos un vector auxiliar para despues poder instanciarlo en la clase Ahorcado

        for (int i = 0; i < longitud; i++) { //Relleno el vector auxiliar con las letras.
            aux[i] = palabra.substring(i, i + 1);
        }
        System.out.println("");
        return ah = new Ahorcado(aux, 0, intentos); //Instanciamos el objeto con las variables utilizadas en el metodo.
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + ah.getPalabra().length);
    }

    public void buscar(Scanner leer) {
        
        System.out.print("Ingrese una letra a encontrar: ");
        int cont = 0;
        letra = leer.next(); //Creamos una variable para leerla y despues compararla con las del vector.
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (ah.getPalabra()[i].equalsIgnoreCase(letra)) { //si palabra en [i] es igual(sin discriminar entre min o may) a letra...
                System.out.print("La letra se encuentra en la palabra.");
            } else { //Sino se suma un contador.
                cont++;
            }
        }
        if (cont == ah.getPalabra().length) { //Si el contador es igual a la longitud del vector, quiere decir que no encontro ninguna letra.
            System.out.println("La letra no se encuentra en la palabra.");
        }
    }

    public void encontradas() {
        int contsi = 0;
        boolean vof = false;
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (ah.getPalabra()[i].equalsIgnoreCase(letra)) {
                contsi++;
            }
        }

        if (contsi >= 1) {
            vof = true;
            ah.setCant_letras_Encontradas(ah.getCant_letras_Encontradas() + contsi);
            System.out.println(vof);
        } else {
            ah.setCant_Oportunidades(ah.getCant_Oportunidades() - 1);
            vof = false;
            System.out.println(vof);
        }
        
        System.out.println("Cantidad de letras encontradas: " + ah.getCant_letras_Encontradas());
        System.out.println("Cantidad de letras que faltan encontrar: " + ah.getCant_letras_Encontradas());
    }

    public void juego() {
        serviciosAhorcado srv = new serviciosAhorcado();
        srv.crearJuego(leer);
        do {
        srv.longitud();
        srv.buscar(leer);
        srv.encontradas(); 
        } while (ah.getCant_Oportunidades() == 0);
       
    }

}
