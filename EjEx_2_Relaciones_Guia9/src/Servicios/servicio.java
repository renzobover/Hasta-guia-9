/*
 
 */
package Servicios;

import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Cine;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class servicio {

    private Scanner leer;
    private Cine cine = new Cine();

    public servicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearEspectadores() {
        Espectador esp = new Espectador();
        System.out.print("Ingrese su nombre: ");
        esp.setNombre(leer.next());
        System.out.print("Ingrese su edad: ");
        esp.setEdad(leer.nextInt());
        System.out.print("¿Cuanto dinero tiene disponible? ");
        esp.setDinero_disponible(leer.nextDouble());
    }

    public void cartelera() {
        Pelicula peli = new Pelicula();
        peli.setTitulo("Dumm Goberners 2.");
        peli.setDirector("Quemi Ras Bobó.");
        peli.setEdad_minima(18);
        peli.setDuracion(1.53);
        System.out.println("Bienvenido al cine Vergamino, donde te aseguramos una experiencia de mierda.");
        System.out.println("- Pelicula de hoy: " + peli.getTitulo());
        System.out.println("- Dirigida por: " + peli.getDirector());
        System.out.println("- Duracion: " + peli.getDuracion() + " hr/s.");
        System.out.println("- Edad minima: " + peli.getEdad_minima() + " años.");
    }
}
