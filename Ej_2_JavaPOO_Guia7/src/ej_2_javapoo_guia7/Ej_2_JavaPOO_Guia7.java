/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).

Esto es para el EJ_5 

public void dibujarRectangulo(double altura, double base) {
        
        for(int i = 0 ; i<altura;i++){
            for(int j = 0 ; j<base ; j++){
                System.out.print("*");
            }
                            System.out.println("");

        }

 */
package ej_2_javapoo_guia7;

import Entidades.Circunferencia;

/**
 *
 * @author renzo
 */
public class Ej_2_JavaPOO_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia cir = new Circunferencia();
        cir.crearCircunferencia();
        cir.Area();
        cir.Perimetro();
    }
    
}
