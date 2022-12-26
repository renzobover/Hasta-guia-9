/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class NIF {

    private char vector[];
    private int DNI;
    private int num;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF(int DNI, char vector[], int num) {
        this.DNI = DNI;
        this.vector = vector;
        this.num = num;
    }

    public NIF() {
        vector = new char[22];
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }

    public int getDNI() {
        return DNI;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public NIF crearObjeto(){
    NIF nif = new NIF();
    return nif;
    }
    
    public NIF crearNIF(NIF nif, Scanner leer){
        System.out.println("Ingrese su DNI: ");
        nif.setDNI(leer.nextInt());
        System.out.println(nif.getDNI());
        nif.setNum(nif.getDNI() % 23);
    return nif;
    }
    
    public void mostrarVector(NIF nif){
        for (int i = 0; i < 22; i++) {
            System.out.println(nif.getVector()[i]);
        }
    }
    
    public void mostrarNIF(NIF nif){ 
        
        System.out.print("A continuacion se mostrara su NIF: ");
        for (int i = 0; i < 23; i++) {
            if (nif.getNum() == i) {
                System.out.print(nif.getDNI() + "-" + nif.getVector()[i]);
            }
        }
        System.out.println("");
    }
    
    
}
//        do {  Esto es para validar si el DNI es valido, es decir si tiene 8 digitos.
//            nif.setDNI(leer.nextInt());
//        } while ((9 >= (nif.getDNI()/10000000) && (1 >= (nif.getDNI()/10000000))));