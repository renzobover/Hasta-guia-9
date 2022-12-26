/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ej_6_javapoo_guia7;

import Atributos.Cafetera;
import Servicios.cafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Ej_6_JavaPOO_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cafeteraServicios srv = new cafeteraServicios();
        Cafetera caf = new Cafetera();
        int opcion;
        do {
        System.out.println("1- Llenar cafetera.");
        System.out.println("2- Servir taza.");
        System.out.println("3- Vaciar cafetera.");
        System.out.println("4- Agregar cafe.");
        System.out.println("5- Consultar la cantidad actual de cafe.");
        System.out.println("6- Apagar.");
        opcion = leer.nextInt();
        
            switch (opcion) {
                case 1: srv.llenarCafetera(caf);                    
                    break;
                case 2: srv.servirTaza(caf);                    
                    break;
                case 3: srv.vaciarCafetera(caf);                    
                    break;
                case 4: srv.agregarCafe(caf);
                    break;
                case 5: srv.cantidadCafe(caf);
                    break;
                case 6: System.out.println("Apagando...");
                
            }
        } while (opcion != 6);
        
        
        
    }
    
}
