/*
Clase Persona con atributos: nombre, apellido, edad, documento y Perro.
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro per;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPer() {
        return per;
    }

    public void setPer(Perro per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", per=" + per + '}';
    }
    
    
    
}
