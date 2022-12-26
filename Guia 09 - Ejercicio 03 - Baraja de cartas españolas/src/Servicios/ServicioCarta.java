
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.List;

public class ServicioCarta {


    public List cargarCartas(Carta carta1, Baraja Baraja1) {
        
        ArrayList<Carta> cartaArrayList = new ArrayList();
        
        for (int i = 0; i < 12; i++) {
            if (i != 7 && i != 8) {

                carta1.setNumero(i + 1);
                cartaArrayList.add(new Carta("Espadas", carta1.getNumero()));
                cartaArrayList.add(new Carta("Bastos", carta1.getNumero()));
                cartaArrayList.add(new Carta("Oros", carta1.getNumero()));
                cartaArrayList.add(new Carta("Copas", carta1.getNumero()));
            }
        }

        Baraja1.setCartas(cartaArrayList);

        return Baraja1.getCartas();
    }

    public void mostrarCartas(Baraja Baraja1) {
        for (Carta auxCarta : Baraja1.getCartas()) {
            System.out.println(auxCarta);
        }
        System.out.println("La cantidad de cartas en la baraja es de " + Baraja1.getCartas().size());
    }
}
