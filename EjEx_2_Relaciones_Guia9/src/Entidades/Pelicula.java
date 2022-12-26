/*
Luego, de las películas nos interesa saber el título, duración, edad mínima y director.
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Pelicula {
    
    private String titulo;
    private double duracion;
    private int edad_minima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edad_minima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    
}
