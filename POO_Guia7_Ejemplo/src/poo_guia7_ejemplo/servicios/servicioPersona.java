/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_guia7_ejemplo.servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class servicioPersona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona CrearPersona() {

        System.out.print("Introduzca el nombre: ");
        String nombre = leer.next();

        System.out.print("Introduzca el apellido: ");
        String apellido = leer.next();

        System.out.print("Introduzca el DNI: ");
        String dni = leer.next();

        System.out.print("Introduzca el pais: ");
        String pais = leer.next();

        System.out.print("Introduzca la provincia: ");
        String provincia = leer.next();

        System.out.print("Introduzca la direccion: ");
        String direccion = leer.next();

        return new Persona(nombre, apellido, dni, pais, provincia, direccion);
    }
}
