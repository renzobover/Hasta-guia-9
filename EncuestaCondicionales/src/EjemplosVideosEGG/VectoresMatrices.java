/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjemplosVideosEGG;

import java.util.Scanner;


/**
 *
 * @author renzo
 */
public class VectoresMatrices {
     /**Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
* a e i o u
     * @param args
  @ # $ % *
    */
    public static void main(String[] args){
   
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String palabra = leer.nextLine();
        int largo = palabra.length();
        String[] vector = new String[largo];
        for (int i = 0; i < largo; i++) {
            vector[i] = palabra.substring(i,i+1);
        }
        System.out.println(largo); 
        String[] retorno = Intercambio(vector,palabra,largo);
        
        
    }
    public static String[] Intercambio(String[] vector, String palabra, int largo){
        String[] palabra2 = new String[largo];
        
        for (int i = 0; i < (largo-1); i++) {
            switch (vector[i]) {
                case "a": vector[i] = "@";
                    break;
                case "e": vector[i] = "#";                    
                    break;
                case "i": vector[i] = "$";                 
                    break;
                case "o": vector[i] = "%";                    
                    break;
                case "u": vector[i] = "*";                    
                    break;                  
            }
            for (int j = 0; j < largo-1; j++) {
               palabra2[j] = vector[j]; 
            }
                
        }
        return palabra2;
}
}
//Ejercicio 11 sin terminar


 
   
    