/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_guia7_ejemplo;

import Entidad.Persona;
import poo_guia7_ejemplo.servicios.servicioPersona;
/**
 *
 * @author renzo
 */
public class POO_Guia7_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     servicioPersona sp = new servicioPersona();   
     Persona p1 = sp.CrearPersona();
     p1.toString();
    }
    
}
