/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Atributos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class rectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo rec = new Rectangulo();

    public Rectangulo crearRectangulo() {
        System.out.print("Ingrese la base del rectangulo: ");
        rec.setBase(leer.nextInt());
        System.out.println(" ");
        System.out.print("Ingrese la altura del rectangulo: ");
        rec.setAltura(leer.nextInt());
        return rec;
    }

    public void superficie() {
        //Superficie = base * altura
        System.out.print("La superficie del rectangulo es: ");
        System.out.println(rec.getBase() * rec.getAltura());
    }

    public void perimetro() {
        //Perímetro = (base + altura) * 2.
        System.out.print("El perimetro del rectangulo es: ");
        System.out.println((rec.getBase() + rec.getAltura()) * 2);
    }
}
