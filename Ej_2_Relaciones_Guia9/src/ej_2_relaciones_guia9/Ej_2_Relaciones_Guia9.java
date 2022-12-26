/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. 
 */
package ej_2_relaciones_guia9;
import Entidades.Jugador;
import Entidades.Revolver;
import Entidades.Juego;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author renzo
 */
public class Ej_2_Relaciones_Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador>j = new ArrayList();
        System.out.print("¿Cuantos jugadores participarán del juego? (Maximo 6 jugadores): ");
        int opcion = leer.nextInt();
        if (opcion<1||opcion>6) {
            opcion = 6;
        }
        for (int i = 0; i < opcion; i++) {
            Jugador a = new Jugador(i + 1);
            j.add(a);
        }
        
        System.out.println("Se preparará el revolver...");
        Revolver r2 = new Revolver();        
        Juego ju = new Juego();
        
        System.out.println("Se termino de preparar el revolver. Se iniciara el juego. Preparate muñeco...");
        ju.llenarJuego(j, r2);
        
        boolean juegoSigue = true;
        int turno = 0;
        while (juegoSigue) {
            if (turno == (opcion)){
                turno = 0;
            }
            System.out.println("El " + ju.getJugadores().get(turno).getNombre() + " procede a disparar");
            juegoSigue = ju.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + ju.getJugadores().get(turno).getNombre() + " se salva");
            } else {
                System.out.println("El " + ju.getJugadores().get(turno).getNombre() + " ha sido mojado");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
    }
        
        
        
        
        
        
        
//        Revolver rev = new Revolver();
//        rev.llenarRevolver();
//        rev.mojar();
//        rev.siguienteChorro();
//        System.out.println(rev.toString());
    }
    

