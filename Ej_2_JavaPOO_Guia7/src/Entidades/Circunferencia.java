/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Circunferencia {

    Scanner leer = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getCircunferencia() {
        return radio;
    }

    public void setCircunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
    }
    
    public void Area(){
        double ar = (radio * radio) * 3.1416;
        System.out.println("El area es " + ar); 
    }
    
    public void Perimetro(){
    double per = 2 * 3.1416 * radio;
        System.out.println("El perimetro es " + per);
    }
    
    
}
