
package guia.pkg09.ejercicio.pkg03.baraja.de.cartas.españolas;

import Entidades.Baraja;
import Entidades.Carta;
import Servicios.ServicioBaraja;
import Servicios.ServicioCarta;

/*

@author Damian

 */
public class Guia09Ejercicio03BarajaDeCartasEspañolas {

    public static void main(String[] args) {
        /*
        
        3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
           y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
           contener un método toString() que retorne el número de carta y el palo. La baraja estará
           compuesta por un conjunto de cartas, 40 exactamente.

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
        
        Carta carta1 = new Carta();
        Baraja Baraja1 = new Baraja();
        
        ServicioCarta ServicioCarta1 = new ServicioCarta();
        ServicioBaraja ServicioBaraja1 = new ServicioBaraja();
        ServicioCarta1.cargarCartas(carta1, Baraja1);
        ServicioBaraja1.menu(Baraja1);
        
        
    }
    
}
