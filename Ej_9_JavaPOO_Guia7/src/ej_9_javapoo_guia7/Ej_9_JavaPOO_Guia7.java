/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

        LocalDate FechaActual = LocalDate.now();   
        LocalDate nacimiento = P.getNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
        long edad = ChronoUnit.YEARS.between(nacimiento, FechaActual);

 */
package ej_9_javapoo_guia7;

import Atributos.Matematica;
import java.lang.Math;

/**
 *
 * @author renzo
 */
public class Ej_9_JavaPOO_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        mat.setNum1(Math.random()*100);
        mat.getNum1();
        mat.setNum2(Math.random()*100);
        mat.getNum2();
        mat.devolverMayor(mat);
        mat.calcularPotencia(mat);
        mat.calcularRaiz(mat);
    }
    
}
