/*
Clase Perro, que tendrá como atributos: nombre, raza, edad y tamaño.
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Perro {
    
    private String nombre;
    private String raza;
    private Integer edad;
    private Integer tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Integer tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
