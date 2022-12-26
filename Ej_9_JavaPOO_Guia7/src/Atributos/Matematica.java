/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Atributos;
import java.lang.Math;
/**
 *
 * @author renzo
 */
public class Matematica {

    private double num1, num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor(Matematica mat) {
        double mayor = Math.max(mat.getNum1(), mat.getNum2());
        System.out.println("El numero mayor es: " + mayor);
    }

    public void calcularPotencia(Matematica mat) {
        int n1 = Math.round((int) mat.getNum1());
        int n2 = Math.round((int) mat.getNum2());
        int potencia = (int) Math.pow(Math.max(n1, n2), Math.min(n1, n2));
        System.out.println("La potencia del mayor valor elevado al menor número es: " + potencia);
    }

    public void calcularRaiz(Matematica mat) {
        double n = Math.abs(Math.min(mat.getNum1(), mat.getNum2()));
        double r_cuadrada = Math.sqrt(n);
        System.out.println("La raíz cuadrada del menor de los dos valores es: " + r_cuadrada);
    }
}
