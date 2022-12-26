/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosVideosEGG;
import java.util.Scanner;
/**
 *
 * @author renzo
 */
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
*/
public class Ejercicio_13_manos_a_la_obra {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingrese la cantidad de personas que pertenecen al equipo: ");
    int num = leer.nextInt();
    String[] equipo;     
    equipo = new String[num];
        System.out.println("Ahora ingrese los nombres de los integrantes: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Integrante Nro " + (i+1) + ": ");
            equipo[i] = leer.next();
            System.out.println("");
        }
    }
}
