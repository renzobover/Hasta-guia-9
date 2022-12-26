/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package ej_3_relaciones_guia9;

import Enumeraciones.BarajaEnum;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Ej_3_Relaciones_Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Baraja carta = new Baraja();
        ArrayList<Baraja> cartaAux = new ArrayList<>(); //ArrayList auxiliar
        ArrayList<Baraja> descarte = new ArrayList<>();
        
        for (BarajaEnum aux : BarajaEnum.values()) { //Para oro, copa, espada, o basto, le asignamos el numero del 1 al 12
            for (int i = 0; i < 12; i++) {
                if (i == 7) { //Este if saltea los numeros 8 y 9
                    i = 8;
                } else {
                    cartaAux.add(new Baraja((i+1), aux)); //Agregamos un nuevo objeto a la lista auxiliar.
                    carta.setCartas(cartaAux); //seteamos el auxiliar en los atributos.
                }
            }
        }
        
        for (Baraja aux : carta.getCartas()) {
            System.out.print(aux.getNum().toString());
            System.out.print(" de " + aux.getPalo().toString());
            System.out.println(" ");
        }
        int opcion;
        do {
            System.out.println("Menu...");
            System.out.println("-1: Barajar el mazo.");
            System.out.println("-2: Dar siguiente carta del mazo.");
            System.out.println("-3: Dar el numero de cartas disponibles del mazo.");
            System.out.println("-4: Dar un numero indicado de cartas del mazo.");
            System.out.println("-5: Mostrar las cartas que ya han salido.");
            System.out.println("-6: Mostrar la baraja en su totalidad.");
            System.out.println("-0: Salir.");
            
            opcion = leer.nextInt();
            switch (opcion) {
            case 1: 
                carta.barajar();
                System.out.println("El mazo ha sido barajado.");
                System.out.println("----------------");
                break;
            case 2:
                descarte.add(carta.getCartas().get(0));//Removemos la carta de la lista original para guardarla en otra lista 
                carta.siguienteCarta();//Da la primer carta del mazo (primer indice del arrayList)
                break;
            case 3: 
                carta.cartasDisponibles();
                break;
            case 4: 
                System.out.println("Indique la cantidad de cartas que quiere del mazo.");
                int cantidad = leer.nextInt();
                if (cantidad > carta.getCartas().size()) {
                    System.out.println("El numero indicado de cartas supera a las disponibles en el mazo.");
                } else {
                for (int i = 0; i < cantidad; i++) {
                    descarte.add(carta.getCartas().get(i));
                }
                carta.darCartas(cantidad);
                }
                break;
            case 5: 
                if (descarte.isEmpty()) {
                    System.out.println("Aun no se repartió ninguna carta.");
                } else {
                    System.out.println(descarte.toString());
                }
                break;
            case 6:
                carta.mostrarBaraja();
                break;
                
            case 0:
                System.out.println("Chau.");
                break;
        }
            
        } while (opcion != 0);
        
    
    
    }
    
    
    
}
