/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package Servicios;

import Atributos.Persona;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class personaServicios {

    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona(Persona p1) {

        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo: Hombre (H), Mujer(M), Otro(O)");
        String letra;
        do {
            letra = leer.next();
            if ((!"H".equalsIgnoreCase(letra)) || (!"M".equalsIgnoreCase(letra)) || (!"O".equalsIgnoreCase(letra))) {
                System.out.println("Opcion incorrecta. Ingrese una opcion valida.");
            }
        } while ((!"H".equalsIgnoreCase(letra)) && (!"M".equalsIgnoreCase(letra)) && (!"O".equalsIgnoreCase(letra)));

        System.out.println("Ingrese su peso corporal: ");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura: ");
        p1.setAltura(leer.nextDouble());

        return p1;
    }

    public int calcularIMC(Persona p1) {
        double pesoIdeal = (p1.getPeso() / (p1.getAltura() * p1.getAltura()));
        if (pesoIdeal < 20) {
            return -1;
        } else if ((pesoIdeal >= 20) && (pesoIdeal <= 25)) {
            return 0;
        } else {
            return +1;
        }
    }

    public boolean esMayorDeEdad(Persona p1) {

        if (p1.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }

    }
}
