/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Atributos.Cuenta;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class cuentaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta count = new Cuenta();
    
    public Cuenta crearCuenta(){
        System.out.print("Ingrese su numero de cuenta: ");
        count.setNumeroCuenta(leer.nextInt());
        System.out.println(" ");
        System.out.print("Ingrese su DNI: ");
        count.setDNI(leer.nextInt());
        System.out.println(" ");
        
        
    return count;
    }
    
    public Cuenta ingresar(Cuenta count){
        System.out.print("Especifique la cantidad de dinero que quiere ingresar a la cuenta: ");
        count.setSaldo_actual(leer.nextInt());
        return count;
    }
    
    public Cuenta retirar(Cuenta count){
        double ret = 0.0;
        System.out.print("Ingrese la cantidad de dinero que quiera retirar: ");
        ret = leer.nextDouble();
        if (ret > count.getSaldo_actual()) {
            System.out.println("El monto que quiere extraer supera su saldo actual: ");
        }else{
            count.setSaldo_actual(count.getSaldo_actual() - ret);
        }
        return count;
    }
    
    public Cuenta extraccionRapida(Cuenta count){
        double ret = 0.0;
        System.out.print("Recuerde que solo puede retirar hasta el 20% de su saldo actual: ");
        ret = leer.nextDouble();
        if (ret > (count.getSaldo_actual() * 0.2)) {
            System.out.println("El monto que quiere extraer, (" + ret + ") supera el 20% de su saldo actual.");
        }else{
            count.setSaldo_actual(count.getSaldo_actual() - ret);
        }
    return count;
    }
    
    public void consultarSaldo(Cuenta count){
        System.out.println("Su saldo actual es: " + count.getSaldo_actual());
    }
    
    public Cuenta consultarDatos(){
        System.out.println(count.toString());
        return count;
    }
    
}
