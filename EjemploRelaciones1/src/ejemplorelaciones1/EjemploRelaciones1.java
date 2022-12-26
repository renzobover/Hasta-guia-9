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
public class EjemploRelaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugador j1 = new Jugador();
        j1.setNombre("Pepe");
        j1.setApellido("Mujica");
        j1.setPosicion("Delantero");
        j1.setNumero(9);
        
        Jugador j2 = new Jugador();
        j2.setNombre("Mariana");
        j2.setApellido("Lopez");
        j2.setPosicion("Defensora");
        j2.setNumero(5);
        
      
        
        ArrayList<Jugador> equipo = new ArrayList();
        equipo.add(j1);
        equipo.add(j2);
        
        Equipo eq = new Equipo();
        eq.setEq(equipo);
        
        
        for (Jugador jugador : equipo) {
            System.out.println(jugador.toString());
            
        }
        
        
    }
    
}
