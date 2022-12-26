/*
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
package ej_3_relaciones_guia9;

import Enumeraciones.BarajaEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author renzo
 */
public class Baraja {
    
    private Integer num;
    private BarajaEnum palo;
    private ArrayList<Baraja> cartas = new ArrayList<>();

    public Baraja() {
    }

    public Baraja(Integer num, BarajaEnum palo) {
        this.num = num;
        this.palo = palo;
    }
    
    

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BarajaEnum getPalo() {
        return palo;
    }

    public void setPalo(BarajaEnum palo) {
        this.palo = palo;
    }

    public ArrayList<Baraja> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Baraja> cartas) {
        this.cartas = cartas;
    }  
    
    public void barajar(){
        Collections.shuffle(cartas);
    }

    @Override
    public String toString() {
        return num + " de " + palo;
    }
    
    
    
    public void siguienteCarta(){
        System.out.println(cartas.get(0).toString());
        cartas.remove(0);
    }
    
    public void cartasDisponibles(){
        int cont = 0;
        for (Baraja carta : cartas) {
            cont++;
        }
        System.out.println("Quedan " + cont + " cartas disponibles en el mazo.");
    }
    
    public void darCartas(int c){
        for (int i = 0; i < c; i++) {
            siguienteCarta();
        }

//        Iterator<Baraja> itcarta = cartas.iterator();
//        int cont = c+1;
//        while (cont > 0) {
//            System.out.println(itcarta.next().getNum().toString());
//            System.out.println(itcarta.next().getPalo().toString());
//            cont--;
//        }
//        
//        cont = c+1;
//        
//        while (cont != 0) {
//            itcarta.remove();
//            cont--;
//        }
        
//        for (int i = 0; i < c; i++) {
//            String aux = cartas.get(i).toString();
//            System.out.println(aux);
//        }
//        for (int i = 0; i < c; i++) {
//            cartas.remove(i);
//        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Estas son las cartas disponibles que quedan en el mazo.");
        for (Baraja carta : cartas) {
            System.out.print(carta.getNum().toString() + " de ");
            System.out.println(carta.getPalo().toString());
        }
    }
}
