
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBaraja {
    /*
    
       Las operaciones que podrá realizar la baraja son: 
        • barajar(): cambia de posición todas las cartas aleatoriamente. 
        • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
        se haya llegado al final, se indica al usuario que no hay más cartas. 
        • cartasDisponibles(): indica el número de cartas que aún se puede repartir. 
        • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
        cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
        debemos indicárselo al usuario. 
        • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
        indicárselo al usuario 
        • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
        luego se llama al método, este no mostrara esa primera carta. 
    
    */
    private ArrayList<Carta> ArrayListBarajaAux;
    private ArrayList<Carta> ArrayListMonton;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ServicioBaraja() {
        this.ArrayListBarajaAux = new ArrayList<>();
        this.ArrayListMonton = new ArrayList<>();
    }
    
    public Baraja barajar(Baraja Baraja1) {
        
        
        ArrayListBarajaAux.addAll(Baraja1.getCartas());
        Collections.shuffle(ArrayListBarajaAux);
        Baraja1.setCartas(ArrayListBarajaAux);
        for (Carta aux : Baraja1.getCartas()) {
            System.out.println(aux);
        }
        
        return Baraja1;
    }
    
    public Baraja cartasDisponibles (Baraja Baraja1) {
        
        System.out.println("La cantidad de cartas disponibles en la baraja es de " + Baraja1.getCartas().size());
        
        return Baraja1;
    }
    
    public Baraja siguienteCarta(Baraja Baraja1) {

        if (Baraja1.getCartas().size() != 0) {
            System.out.println(ArrayListBarajaAux.get(0));
            ArrayListMonton.add(ArrayListBarajaAux.get(0));
            ArrayListBarajaAux.remove(0);
            Baraja1.setCartas(ArrayListBarajaAux);
        } else if (Baraja1.getCartas().size() == 0) {
            System.out.println("No hay mas cartas en la baraja");
        }

        return Baraja1;
    }
    
    public Baraja darCartas(Baraja Baraja1) {
        int cantCartas;

        System.out.println("Ingrese la cantidad de cartas que quiere sacar de la baraja");
        cantCartas = leer.nextInt();

        if (Baraja1.getCartas().size()>=cantCartas) {
            for (int i = 0; i < cantCartas; i++) {
                siguienteCarta(Baraja1);
                 }
            } else {
                System.out.println("No hay cartas suficientes en la baraja");
        }
        
       return Baraja1; 
    }
    
    public void cartasMonton(Baraja Baraja1) {
        System.out.println("La cantidad de cartas en el monton es de " + ArrayListMonton.size());
        if (ArrayListMonton.isEmpty()) {
            System.out.println("No hay cartas para mostrar");
            } else {
            for (Carta aux : ArrayListMonton) {
                System.out.println(aux);
            }
        }

    }
    
    public void mostrarBaraja (Baraja Baraja1) {
        System.out.println("La cantidad de cartas en la baraja es de " + Baraja1.getCartas().size());
        for (Carta aux : Baraja1.getCartas()) {
            System.out.println(aux);
        }
    }
    
    public void menu(Baraja Baraja1) {
       int Menu;
       System.out.println("-----------------------------------------");
       System.out.println("Bienvenido al sistema de cartas españolas");
       System.out.println("-----------------------------------------");
       
       do {
            System.out.println("----------------------------------------------------");
            System.out.println("-         Seleccione la opcion deseada:            -");
            System.out.println("-1. Barajar las cartas.                            -");
            System.out.println("-2. Recibir cartas.                                -");
            System.out.println("-3. Cartas disponibles en la baraja.               -");
            System.out.println("-4. Mostrar las cartas que han salido de la baraja.-");
            System.out.println("-5. Mostrar las cartas que aun quedan en la baraja.-");
            System.out.println("----------------------------------------------------");
            Menu = leer.nextInt();
            switch (Menu) {
                case 1:
                    barajar(Baraja1);
                    break;
                case 2:
                    darCartas(Baraja1);
                    break;
                case 3:
                    cartasDisponibles(Baraja1);
                    break;
                case 4:
                    cartasMonton(Baraja1);
                    break;
                case 5:
                    mostrarBaraja(Baraja1);
                    break;
                }
                 if (Menu > 5 || Menu < 1) {
                     System.out.println("----------------------------");
                     System.out.println("Ingreso una opcion no valida");
                     System.out.println("----------------------------");
                 }
   
        } while (Menu < 6 || Menu > 0);
   }
}
