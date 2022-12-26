/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej_11_javapoo_guia7;

import Atributos.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Ej_11_JavaPOO_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        Fecha fech = new Fecha();
        
        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        Date fecha = new Date((anio-1900),mes,dia);
        fech.setFecha(fecha);
        
        System.out.println("Fecha ingresada: " + fech.formatoFecha());
        
        Date fechaActual = new Date();
        
        int diferencia = fechaActual.getYear() - fecha.getYear();
        
        System.out.println("La diferencia entre el año ingresado [" + (fecha.getYear()+1900) + "] y el año actual [" 
                + (fechaActual.getYear() + 1900) + "] es de " + diferencia + " años.");
        
        
    }
    
}
