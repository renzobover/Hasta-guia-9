/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro CrearLibro(){
        Libro lb = new Libro();
        System.out.print("Ingrese el nombre del autor: ");
        lb.setAutor(leer.next());
        System.out.print("Ingrese el titulo del libro: ");
        lb.setNombre(leer.next());
        System.out.println("Ingrese el numero de ISBM: ");
        lb.setISBN(leer.next());
        System.out.println("Ingrese el numero de paginas que contiene el libro: ");
        lb.setNroPaginas(leer.nextInt());
        return lb;
    }
    
    public void MostrarLibros(Libro lb){
        System.out.println("Nombre del autor: " + lb.getAutor());
        System.out.println("Nombre del libro: " + lb.getNombre());
        System.out.println("Numero de ISBM " + lb.getISBN());
        System.out.println("Numero de paginas: " + lb.getNroPaginas());
    }
}
