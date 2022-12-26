/*
 Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package ejemplorelaciones1;

import java.util.ArrayList;

/**
 *
 * @author renzo
 */
public class Equipo {
   
    private ArrayList<Jugador> eq;

    public Equipo() {
    }

    public ArrayList<Jugador> getEq() {
        return eq;
    }

    public void setEq(ArrayList<Jugador> eq) {
        this.eq = eq;
    }

    @Override
    public String toString() {
        return "Equipo{" + "eq=" + eq + '}';
    }
    
    
    
}
