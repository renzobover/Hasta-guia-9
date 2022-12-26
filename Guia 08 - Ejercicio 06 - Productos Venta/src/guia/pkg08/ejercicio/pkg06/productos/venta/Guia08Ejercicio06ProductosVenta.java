
package guia.pkg08.ejercicio.pkg06.productos.venta;

import Servicios.ServiciosProducto;
import java.util.Scanner;

/*

@author Damian Muñoz

 */
public class Guia08Ejercicio06ProductosVenta {

    public static void main(String[] args) {
        /*
        
        6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
           productos que venderemos y el precio que tendrán. Además, se necesita que la aplicación 
           cuente con las funciones básicas.  
           Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
           eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar Hashmap).
           El HashMap tendrá de llave el nombre del producto y de valor el precio.
           Realizar un menú para lograr todas las acciones previamente mencionadas.  
        
        */
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosProducto SP = new ServiciosProducto();
        SP.menu();
        
    }
    
}
