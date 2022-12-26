/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */    
package Servicios;

import Atributos.Operacion;
import java.util.Scanner;

public class numServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Operacion op = new Operacion();
    
    public Operacion crearOperacion(){
        System.out.println("ingrese dos numeros enteros para realizar las operaciones");
        op.setNum1(leer.nextInt());
        op.setNum2(leer.nextInt());
        
        return op;
    }
    
    public double suma(){
        
        return(op.getNum1() + op.getNum2());
     
    }
    
    public double resta(){
        
        return(op.getNum1() - op.getNum2());
        
    }
    
    public void multiplicacion(){
        if (op.getNum1()== 0 || op.getNum2()== 0){
            System.out.println("NO SE PUEDE MULTIPLICAR POR 0 ");
        }else{
         System.out.println("La multiplicacion es: " + op.getNum1() * op.getNum2());
        }
         
    }
    
    public void division(){
        if (op.getNum1()== 0 || op.getNum2()== 0){
            System.out.println("NO SE PUEDE DIVIDIR POR 0 ");
        }else{
         System.out.println("La division es: " + op.getNum1() / op.getNum2());
        }
         
    }

    

    
    

   
}
