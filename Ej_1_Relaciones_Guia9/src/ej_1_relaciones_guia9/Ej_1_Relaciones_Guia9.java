/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ej_1_relaciones_guia9;
import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author renzo
 */
public class Ej_1_Relaciones_Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Persona> personaArrayList = new ArrayList<>(); //Lista de tipo Persona
        Persona per = new Persona();
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Persona " + (i+1) + "-------------------------");
//            System.out.print("Ingrese el nombre: ");
//            String nombre = leer.next();
//            System.out.print("Ingrese su apellido: ");
//            String apellido = leer.next();
//            System.out.print("Ingrese su edad: ");
//            Integer edad = leer.nextInt();
//            System.out.print("Ingrese su documento(sin puntos): ");
//            Integer doc = leer.nextInt();
//            
//            personaArrayList.add(new Persona(nombre, apellido, edad, doc)); //Agrego en la Lista una nueva Persona por constructor
//        }

        personaArrayList.add(new Persona("Bernardo", "Banegas", 28, 40438726));
        personaArrayList.add(new Persona("Mariana", "Rios", 23, 40648826));
        
        ArrayList<Perro> perroArrayList = new ArrayList<>(); //Lista de tipo Perro
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Perro " + (i+1) + "-------------------------");
//            System.out.print("Ingrese el nombre del perro: ");
//            String nombre = leer.next();
//            System.out.print("Ingrese la raza del perro: ");
//            String raza = leer.next();
//            System.out.print("Ingrese el tamaño: ");
//            Integer tamaño = leer.nextInt();
//            System.out.print("Ingrese la edad: ");
//            Integer edad = leer.nextInt();
//            
//            perroArrayList.add(new Perro(nombre, raza, edad, tamaño));//Agrego en la Lista un nuevo Perro por constructor
//        }
        perroArrayList.add(new Perro("Firulais", "Golden", 2, 25));
        perroArrayList.add(new Perro("Chiquito", "Caniche", 3, 10));
    
        
//        Iterator<Persona> itPersona = personaArrayList.iterator();
        
        for (Persona persona : personaArrayList) {
            System.out.println("Para la persona " + persona.getNombre() + " " + persona.getApellido() + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perroArrayList) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            
            System.out.print("¿Que perro desea adoptar? -");
            String adoptar = leer.next();
            
            int ctrol = 0;
            for (int i = 0; i < perroArrayList.size(); i++) { //DE ESTA MANERA SE PUEDE HACER CON UN FOR COMUN
                if (adoptar.equalsIgnoreCase(perroArrayList.get(i).getNombre())) {
                    persona.setPer(perroArrayList.get(i));
                    ctrol++;
                    perroArrayList.remove(i);
                }
            }

//            for (Perro perro : perroArrayList) { //DE ESTA MANERA SE PUEDE HACER CON UN FOR EACH pero me tira error si quiero adoptar el segundo elemento
//                if (adoptar.equalsIgnoreCase(perro.getNombre())) {
//                    persona.setPer(perro);
//                    ctrol++;
//                    perroArrayList.remove(perro);
//                }
//            }
            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }
        
        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personaArrayList) {
            if (aux.getPer() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPer().getNombre() + " de raza " + aux.getPer().getRaza());
            }

        }
        
        
    }
    
}
