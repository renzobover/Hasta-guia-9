/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author renzo
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver rev;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver rev) {
        this.jugadores = jugadores;
        this.rev = rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    public void llenarJuego(ArrayList<Jugador> js2, Revolver r2) {
        jugadores = js2;
        rev = r2;
    }

    public boolean ronda(int i) {
        boolean juegoSigue = true;
        jugadores.get(i).disparo(rev);
        if (jugadores.get(i).isMojado()) {
            juegoSigue = false;
        }
        return juegoSigue;
    }
}
