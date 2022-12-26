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
/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
*/
public class Ejercicio_12_manos_a_la_obra {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int num1,num2;
        System.out.println("Ingrese 2 numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        Multiplos(num1,num2);
    }
    public static void Multiplos(int num1, int num2){
        if (num1 % num2 == 0) {
            System.out.println("El primer numero es multiplo del segundo"); 
        }
        else{
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
