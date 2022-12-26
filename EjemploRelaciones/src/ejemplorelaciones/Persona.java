/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ejemplorelaciones;


/**
 *
 * @author renzo
 */
public class Persona { //Relacion uno a uno, donde Persona USA UN Dni
    private String nombre;
    private String apellido;
    private Dni documento; //Relaciono instanciando un objeto de tipo Dni. Genero sus Getters y Setters

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni documento) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public Dni getDocumento() {
        return documento;
    }

    public void setDocumento(Dni d) {
        this.documento = d;
    }

    
    
    
}
