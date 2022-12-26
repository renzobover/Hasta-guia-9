/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Atributos.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author renzo
 */
public class peliculaServicios {

    private TreeSet<Pelicula> setPelicula; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    public peliculaServicios() {
        this.setPelicula = new TreeSet<>(); // Creo el espacio en memoria del CONJUNTO(SET)
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    

    public void crearPelicula() {
        String opcion = null;

        do {
            System.out.print("Nombre de la pelicula: ");
            String peli = leer.next();
            System.out.print("Nombre del director: ");
            String dir = leer.next();
            System.out.print("Duracion de la pelicula: ");
            Integer duracion = leer.nextInt();
            Pelicula pelicula = new Pelicula(peli, dir, duracion);
            setPelicula.add(pelicula);

            System.out.println("¿Desea agregar una nueva pelicula?");
            System.out.println("S/N");
            opcion = leer.next();
            if (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                do {
                    System.out.println("Ingrese una opcion valida: ");
                    opcion = leer.nextLine();
                } while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n"));
            }

        } while (opcion.equalsIgnoreCase("s"));
    }

    public void mostrarPeliculas() {
        System.out.println("Lista de peliculas-----------------------------");
        for (Pelicula pelicula : setPelicula) {
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("");
    }

    public void mostrarPeliculasDuracion() {
        boolean vof = false;
        for (Pelicula pelicula : setPelicula) {
            if (pelicula.getDuracion() > 1) {
                vof = true;
            }
            }
        System.out.println("-----------------------------------------------");
        
        if (vof == false) {
            System.out.println("No hay peliculas con duracion mayor a 1 hora.");
        } else {
            System.out.println("Lista de peliculas mayores a 1 hora de duracion: ");
            for (Pelicula pelicula : setPelicula) {
                if (pelicula.getDuracion() > 1) {
                    System.out.println(pelicula.getTitulo());
                }
            }
}
        }
    
    
    
    public void mostrarPeliculasOrdenDuracionMenorMayor(){
        ArrayList<Pelicula> setPeliculaArray = new ArrayList(setPelicula);
        setPeliculaArray.sort(Pelicula.compararDuracionMenorMayor);
        System.out.println("-----------------------------------------------");
        System.out.println("Lista de peliculas por duracion de menor a mayor");
        for (Pelicula pelicula : setPeliculaArray) {
            System.out.println(pelicula.getTitulo() + ": " + pelicula.getDuracion() + "hr/s. Dirigida por: " + pelicula.getDirector());
        }
    }
    
    public void mostrarPeliculasOrdenDuracionMayorMenor(){
        ArrayList<Pelicula> setPeliculaArray = new ArrayList(setPelicula);
        setPeliculaArray.sort(Pelicula.compararDuracionMayorMenor);
        System.out.println("-----------------------------------------------");
        System.out.println("Lista de peliculas por duracion de mayor a menor");
        for (Pelicula pelicula : setPeliculaArray) {
            System.out.println(pelicula.getTitulo() + ": " + pelicula.getDuracion() + "hr/s. Dirigida por: " + pelicula.getDirector());
        }
    }
    
    public void mostrarPeliculasAlfabeticoTitulo(){
        ArrayList<Pelicula> setPeliculaArray = new ArrayList(setPelicula);
        setPeliculaArray.sort(Pelicula.compararTitulo);
        System.out.println("-----------------------------------------------");
        System.out.println("Lista de peliculas por orden por titulo en orden Alfabetico");
        for (Pelicula pelicula : setPeliculaArray) {
            System.out.println(pelicula.getTitulo() + ": " + pelicula.getTitulo()+ "hr/s. Dirigida por: " + pelicula.getDirector());
        }
    }
    
    public void mostrarPeliculasAlfabeticoDirector(){
        ArrayList<Pelicula> setPeliculaArray = new ArrayList(setPelicula);
        setPeliculaArray.sort(Pelicula.compararDirector);
        System.out.println("-----------------------------------------------");
        System.out.println("Lista de peliculas por director en orden Alfabetico de mayor a menor");
        for (Pelicula pelicula : setPeliculaArray) {
            System.out.println(pelicula.getTitulo() + ": " + pelicula.getTitulo()+ "hr/s. Dirigida por: " + pelicula.getDirector());
        }
    }
    }


