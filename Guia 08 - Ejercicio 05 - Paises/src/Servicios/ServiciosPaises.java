
package Servicios;


import Entidad.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServiciosPaises {
    Paises Paises1 = new Paises();
    private Scanner leer;
    private TreeSet<String> nombrePaises;
    String pais;
    
    
    public ServiciosPaises() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.nombrePaises = new TreeSet();
    }
    
    public void agregarPaises() {

        System.out.println("Ingrese un pais:");
        pais = leer.next();

        nombrePaises.add(pais);
        Paises1.setNombrePaises(nombrePaises);
    }
    
        public void continuarAgregando() {
        boolean continuarAgregando = false;
        String seguir;

        do {
            System.out.println("Desea agregar otro pais (S/N)");
            seguir = leer.next();
            if (seguir.equalsIgnoreCase("S")) {
                continuarAgregando = true;
                agregarPaises();
            } else if (seguir.equalsIgnoreCase("N")) {
                continuarAgregando = false;
            }
        } while (continuarAgregando);

    }
        
        public void mostrarPaises() {
        
        System.out.println(Paises1.getNombrePaises());
        
            for (int i = 0; i < Paises1.getNombrePaises().size(); i++) {
                Paises1.getNombrePaises();
            }
        
        System.out.println("Cantidad = " + Paises1.getNombrePaises().size());
    }
        
        public void eliminarPais() {
        String buscarPais;
        TreeSet aux = Paises1.getNombrePaises();
        int contarPais = 0;
        System.out.println("Ingrese el pais a buscar");
        buscarPais = leer.next();
        Iterator<String> it = aux.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(buscarPais)) {
                contarPais++;
                it.remove();
            }

        }
        if (contarPais > 0) {
            System.out.println("El pais " + buscarPais + " ha sido encontrado y eliminado de la lista.");
            System.out.println("Lista Actualizada");
            
        } else {
            System.out.println("El pais no fue encontrado en la lista.");
            System.out.println("La lista no fue modificada");
        }
        Paises1.setNombrePaises(nombrePaises);
        System.out.println(Paises1.getNombrePaises());
    }
}
