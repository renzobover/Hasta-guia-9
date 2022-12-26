/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Atributos.Arrays1;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class serviciosArray {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Arrays1 arr = new Arrays1();
    
    public void adivinarMes(){
        String mes = "";
        System.out.println(arr.getMesSecreto());
        do {
        System.out.println("Ingrese un mes a adivinar: ");
        mes = leer.next();
        
        if (arr.getMesSecreto().equals(mes)) {
            System.out.println("Felicidades crack, has acertado!");
        } else {
            
                System.out.println("Usted no ha adivinado, intentelo nuevamente: ");
        }
            } while (!mes.equals(arr.getMesSecreto()));
            
            
        }
    }

