/*
 Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private double dinero_disponible;

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero_disponible() {
        return dinero_disponible;
    }

    public void setDinero_disponible(double dinero_disponible) {
        this.dinero_disponible = dinero_disponible;
    }

    
    
}
