/*
 De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada.
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Cine {
    
    private Espectador [][] asientos;
    private Pelicula peli;
    private double precio_entrada;

    public Cine() {
    }

    public Espectador[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Espectador[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public double getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(double precio_entrada) {
        this.precio_entrada = precio_entrada;
    }

    
    
    
    
}
