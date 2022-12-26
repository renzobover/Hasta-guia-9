/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ej_10_javapoo_guia7;

import Atributos.Arreglos;
import java.util.Arrays;
import java.lang.Math;

/**
 *
 * @author renzo
 */
public class Ej_10_JavaPOO_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglos ar = new Arreglos();
        double[] A = new double[50];
        double[] B = new double[20];

        for (int i = 0; i < 50; i++) {
            A[i] = Math.random() * 50;
        }

        for (int i = 0; i < 20; i++) {
            B[i] = Math.random() * 50;
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        Arrays.sort(A);
        
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                B[i] = A[i];
            } else {
            Arrays.fill(B, 10, 20, 0.5);
            }
            
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }

}
