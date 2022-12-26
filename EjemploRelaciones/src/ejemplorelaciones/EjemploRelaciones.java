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
public class EjemploRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dni doc = new Dni(); //Creo un objeto documento
        doc.setDoc(40423849); 
        doc.setSerie('A');
        
        Persona p = new Persona();//Creo un objeto persona, al cual le voy a pasar el objeto 'doc'.
        p.setDocumento(doc); //Seteo en sus atributos.
        p.setNombre("Roberto");
        p.setApellido("Bolainas");
        
        System.out.println(p.getApellido() + " " + p.getNombre() + " tiene como Dni: " + p.getDocumento().getDoc() + ". De serie '" + p.getDocumento().getSerie() + "'");
        
        
    }
    
}
