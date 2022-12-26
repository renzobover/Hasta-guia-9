
package Servicios;

import Entidades.Producto;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*

@author Damian

 */
public class ServiciosProducto {

    Producto Producto1 = new Producto();
    private HashMap<String, Double> mapaProducto; // Creo EL MAPA
    
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    DecimalFormat limitdecimal = new DecimalFormat("#.##");

    //Esta es una muy buena practica
    public ServiciosProducto() {
        this.mapaProducto = new HashMap<>(); // Creo el espacio en memoria del MAPA
        
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague los DATOS de forma manual
    public void cargarProductos() {
        System.out.println("Ingrese el nombre del producto");
        String nombreIngresado = leer.next();
        nombreIngresado = nombreIngresado.toUpperCase();

        System.out.println("Ingrese el Precio del producto");
        Double precioIngresado = leer.nextDouble();

        // Con este modo agrego elementos a un mapa. Observar que el primer termino se corresponde a la KEY
        mapaProducto.put(nombreIngresado, precioIngresado);
        Producto1.setMapaProductoAtributo(mapaProducto);

    }

    public void continuarAgregando() {
        String seguir;

        do {
            System.out.println("Desea agregar otro Producto (S/N)");
            seguir = leer.next();
            if (seguir.equalsIgnoreCase("S")) {
                cargarProductos();
            } else if (seguir.equalsIgnoreCase("N")) {
                System.out.println("Se cierra el ingreso de productos");
            }
        } while (seguir.equalsIgnoreCase("S"));

    }

    public void imprimirTodos() {
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
        TreeMap<String, Double> mapaProductoTree = new TreeMap<String, Double>(mapaProducto);
        for (Map.Entry<String, Double> entry : mapaProductoTree.entrySet()) {
            System.out.println("Nombre = " + entry.getKey() + ", Precio = $" + limitdecimal.format(entry.getValue()));
        }
    }  
    

    public void buscarElimar() {
        String buscarProducto;
        System.out.println("Ingrese el producto a buscar");
        buscarProducto = leer.next();
        buscarProducto = buscarProducto.toUpperCase();
        if (mapaProducto.containsKey(buscarProducto)) {
            mapaProducto.remove(buscarProducto);
            System.out.println("El producto: {" + buscarProducto + "} ha sido eliminado de la lista.");
            Producto1.setMapaProductoAtributo(mapaProducto);
        } else {
            System.out.println("El producto no se encuentra en la lista");
        }

    }
    
    
    
    public void menu() {
        int Menu;
        System.out.println("---------------------------------------------------");
        System.out.println("Bienvenido al sistema de base de datos de productos");
        System.out.println("---------------------------------------------------");
        System.out.println("Comencemos cargando la informacion de los productos");
        System.out.println("---------------------------------------------------");

        do {
            System.out.println("Seleccione la opcion deseada:");
            System.out.println("1. Cargar un producto.");
            System.out.println("2. Mostrar todos los productos de la lista.");
            System.out.println("3. Eliminar un producto de la lista.");

            Menu = leer.nextInt();
            switch (Menu) {
                case 1:
                    cargarProductos();
                    continuarAgregando();
                    break;
                case 2:
                    imprimirTodos();
                    break;
                case 3:
                    buscarElimar();
                    break;
            }
        } while (Menu < 4 || Menu > 0);
    }

}
