/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
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
package ej_5_javapoo_guia7;

import Atributos.Cuenta;
import Servicios.cuentaServicios;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class Ej_5_JavaPOO_Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cuentaServicios serv = new cuentaServicios();
        System.out.println("Bienvenido. Ingrese sus datos a continuacion...");
        Cuenta count = serv.crearCuenta();
        int opcion;

        do {
            System.out.println("1- Ingresar dinero.");
            System.out.println("2- Retirar dinero.");
            System.out.println("3- Extraccion rapida.");
            System.out.println("4- Consultar saldo actual.");
            System.out.println("5- Consultar datos de la cuenta.");
            System.out.println("6- Salir.");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    serv.ingresar(count);
                    break;
                case 2:
                    serv.retirar(count);
                    break;
                case 3:
                    serv.extraccionRapida(count);
                    break;
                case 4:
                    serv.consultarSaldo(count);
                    break;
                case 5:
                    serv.consultarDatos();
                    break;
                case 6:
                    System.out.println("Hasta luego crack! :)");
                    break;
            }

        } while (opcion != 6);

    }

}
