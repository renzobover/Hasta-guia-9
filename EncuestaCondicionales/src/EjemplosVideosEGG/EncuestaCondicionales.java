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
public class EncuestaCondicionales {

    
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 al 5");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3: 
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que haya disfrutado un excelente entretenimiento");
                    break;}
            
            }else if (opinion < 0){
                System.out.println("¿Una opinion negativa?");
            }else if (opinion == 0){
                System.out.println("El valor " + opinion + "no es valido");
            }else{  
                System.out.println(opinion + "Se te fue la mano con la clasificacion crack");}
        // TODO code application logic here
    }
}
    
