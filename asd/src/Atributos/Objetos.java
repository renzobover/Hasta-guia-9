/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

/**
 *
 * @author renzo
 */
public class Objetos {
    
    private int num1;
    private int num2;
    private String palabra1 = "hola";
    private String palabra2 = "chau";

    public Objetos() {
    }

    public Objetos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Objetos(String hola, String chau) {
        this.palabra1 = hola;
        this.palabra2 = chau;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

    @Override
    public String toString() {
        return "Objetos{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

   
    
    
}
