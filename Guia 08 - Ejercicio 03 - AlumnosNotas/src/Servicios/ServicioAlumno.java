
package Servicios;

import Entidad.Alumno;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioAlumno {
    Alumno Alumno1 = new Alumno();
    ArrayList<Alumno> ArrayAlumnos = new ArrayList();
    DecimalFormat limitdecimal= new DecimalFormat("#.##");
        
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public ServicioAlumno() {
        this.ArrayAlumnos = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void crearAlumno() {
        String nombre;
        Integer notas;
        
        ArrayList<Integer> ArrayNotasAlumnos = new ArrayList();
        
        System.out.println("Ingrese el nombre del alumno");
        nombre = leer.next();
        Alumno1.setNombre(nombre);
        
        
        for (int i = 0; i < 3; i++) {
            do {
             System.out.println("Ingrese la nota "+ (i+1) +" de "+ Alumno1.getNombre());
             notas = leer.nextInt();   
            } while (notas>10 || notas<0);
                        
            ArrayNotasAlumnos.add(i, notas);
            Alumno1.setNotas(ArrayNotasAlumnos);
        }
                         
        ArrayAlumnos.add(new Alumno(nombre, ArrayNotasAlumnos));
                
    }
    
    public void continuarAgregando() {
        String seguir;

        do {
            System.out.println("Desea agregar otro alumno (S/N)");
            seguir = leer.next();
            if (seguir.equalsIgnoreCase("S")) {
                crearAlumno();
            } else if (seguir.equalsIgnoreCase("N")) {
                System.out.println("Se cierra el ingreso de datos");
            }
        } while (seguir.equalsIgnoreCase("S"));

    }
 
    public void NotaFinal() {
        double NotaFinal = 0;
        int contador = 0;
        System.out.println("Ingrese el nombre del alumno al cual le quiere sacar su promedio");
        String nombreB = leer.next();

        for (int i = 0; i < ArrayAlumnos.size(); i++) {
            Alumno Aux2 = ArrayAlumnos.get(i);
            if (Aux2.getNombre().equals(nombreB)) {
                NotaFinal = ((double) (Aux2.getNotas().get(0) + Aux2.getNotas().get(1) + Aux2.getNotas().get(2))/3);                
            } else {
                contador++;
            }

        }
        if (contador != ArrayAlumnos.size()) {
            System.out.println("La nota final del alumno " + nombreB + " es " + limitdecimal.format(NotaFinal));

        } else if (contador == ArrayAlumnos.size()) {
            System.out.println("El alumno que ingreso no esta en la lista");
        }
    }

    
    public void mostrarAlumnos() {

        Collections.sort(ArrayAlumnos, 
(Alumno objeto1, Alumno objeto2) -> objeto1.getNombre().compareTo(objeto2.getNombre()));
        for (Alumno aux : ArrayAlumnos) {
            System.out.println(aux);
        }
        System.out.println("Cantidad = " + ArrayAlumnos.size());
    }
    
}
