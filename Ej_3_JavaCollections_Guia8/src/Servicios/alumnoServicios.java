/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Atributos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class alumnoServicios {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Alumno alu = new Alumno();
    ArrayList<Alumno> objetos = new ArrayList(); //En esta lista se guardaran los objetos Alumnos con sus atributos seteados. 

    public void crearAlumno() {
        ArrayList<Integer> n = new ArrayList(); //Creo una lista auxiliar para luego setearla en los atributos.

        System.out.print("Ingrese el nombre del alumno: ");
        String nom = leer.next(); //Variable para el nombre
        System.out.println("Ingrese las 3 notas del alumno.");
        for (int i = 0; i < 3; i++) { //Hago un for de 3 para llenar la lista de notas solamente con 3 notas.
            System.out.print("Nota " + (i + 1) + ": ");
            int num = leer.nextInt();
            n.add(num);
        }
        alu.setNombre(nom); //Seteo el nombre
        alu.setNotas(n); //Seteo la lista de notas, usando la lista auxiliar "n".
        objetos.add(new Alumno(nom, n)); //Guardo el objeto Alumno, al.
    }

    public void notaFinal() {

        System.out.print("Ingrese el nombre de un alumno para calcular su nota final: ");
        String nom = leer.next();
        boolean vof = false;
        int suma = 0;

        for (Alumno aux : objetos) {
            if (aux.getNombre().equalsIgnoreCase(nom)) {
                vof = true;
                for (int i = 0; i < 3; i++) {
                    suma = suma + aux.getNotas().get(i);
                }
            }
        }

        double prom = suma / 3;

        if (vof == false) {
            System.out.println("El alumno no se encontro.");
        } else {
            System.out.println(nom + " tiene tiene como promedio de nota: " + prom + ".");
        }
    }
}
