/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import Atributos.Productos;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class productosServicios {
    
    private HashMap<String, Double> prodMapaAux; // Creo EL MAPA
    private Scanner leer;

    public productosServicios() {
        this.prodMapaAux = new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    DecimalFormat limitdecimal = new DecimalFormat("#.##");
    Productos p = new Productos();
    
    public void agregarProducto(){
        System.out.println("Nombre del producto: ");
        String nombre = leer.next();
        System.out.println("Precio del producto: ");
        Double precio = leer.nextDouble();
        prodMapaAux.put(nombre, precio);
        p.setProdMapa(prodMapaAux);
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = leer.next();
        boolean vof = false;
        
        for (Map.Entry<String, Double> entry : prodMapaAux.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            if (entry.getKey().matches(nombre)) {
                System.out.println("Ingrese el nuevo precio: ");
                Double nuevoPrecio = leer.nextDouble();
                prodMapaAux.put(key, nuevoPrecio);
                p.setProdMapa(prodMapaAux);
                vof = true;
                System.out.println("Se agrego el nuevo precio.");
            }
            
        }
        
        if (vof == false) {
            System.out.println("No se encontro el nombre del producto.");
        }
        
        
    }
    
    public void eliminarProducto(){
        System.out.println("¿Que producto desea eliminar? :");
        String eliminar = leer.next();
        boolean vof = false;
        
        for (Iterator<Map.Entry<String, Double>> it = prodMapaAux.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Double> entry = it.next();
            String key = entry.getKey();
            Double value = entry.getValue();
            if (key.equals(eliminar)) {
                prodMapaAux.remove(eliminar);
                p.setProdMapa(prodMapaAux);
                vof = true;
                System.out.println("Se elimino el producto");
            }
        }
        
        if (vof == false) {
            System.out.println("No se encontro el nombre del producto.");
        }
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Double> entry : p.getProdMapa().entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println("Producto: " + key + " - Precio: " + value);
        }
    }
    
    public void menu(){
        String opcion = "";

        do {
            System.out.println("Menu--------------------");
            System.out.println("1: Agregar un producto-");
            System.out.println("2: Modificar precio de un producto-");
            System.out.println("3: Eliminar un producto-");
            System.out.println("4: Mostrar lista de productos-");
            System.out.println("0: Salir-");
            opcion = leer.next();
           
            switch (opcion) {
            case "1": 
                agregarProducto();
                break;
            case "2": 
                modificarPrecio();
                break;
            case "3":
                eliminarProducto();
                break;
            case "4": 
                mostrarProductos();
                break;
            case "0":
                System.out.println("Buenas tardes rey/reina ;D");
                break;
            default:
                System.out.println("Opcion no valida");
        }
            
        } while (!opcion.equalsIgnoreCase("0"));
        
        
    }
    
    
}
