/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado, en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Atributos.Cafetera;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class cafeteraServicios {

    Scanner leer = new Scanner(System.in);
    Cafetera cafe = new Cafetera();

    public Cafetera llenarCafetera(Cafetera cafe) {
        cafe.setCapacidadMaxima(2000);
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        return cafe;
    }

    public Cafetera servirTaza(Cafetera cafe) {
        int tamaño; //lo que sirvo de cafe
        System.out.println("Ingrese el tamaño de la taza (en mililitros): ");
        tamaño = leer.nextInt();
        if (cafe.getCantidadActual() < tamaño) {
            tamaño = cafe.getCantidadActual();
            System.out.println("La taza no se llenó, en cambio se sirvio " + tamaño + "mililitros.");
            cafe.setCantidadActual(cafe.getCantidadActual() - tamaño);
            
        } else {
            System.out.println("La taza se lleno.");
            cafe.setCantidadActual(cafe.getCantidadActual() - tamaño);
        }
        return cafe;
    }

    public Cafetera vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
        return cafe;
    }

    public Cafetera agregarCafe(Cafetera cafe) {
        System.out.println("Ingrese la cantidad de cafe (en mililitros) que quiere agregar a la cafetera: ");
        int cantidad = leer.nextInt();
        if ((cantidad + cafe.getCantidadActual()) > cafe.getCapacidadMaxima()) {
            int sugerencia = cafe.getCapacidadMaxima() - cafe.getCantidadActual();
            System.out.println("La cantidad de cafe especificada no entra en la cafetera. Se sugiere cargarle "
                    + sugerencia + " ml. para que no revalse.");
        } else { 
        cafe.setCantidadActual(cantidad + cafe.getCantidadActual());
        }
        return cafe;
    }
    
    public void cantidadCafe(Cafetera cafe){
        System.out.println("La cantidad actual de cafe es de " + cafe.getCantidadActual() + "ml.");
    }
}
