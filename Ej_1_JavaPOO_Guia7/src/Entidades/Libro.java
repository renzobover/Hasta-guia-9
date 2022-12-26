/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Libro {
    
   
    private String ISBN; //International Standar Book Number
    private String autor;
    private String nombre;
    private int nroPaginas;

    public Libro() {
    
    }

    public Libro(String ISBN, String autor, String nombre, int nroPaginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.nombre = nombre;
        this.nroPaginas = nroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    
    
}
