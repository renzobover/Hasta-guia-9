/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
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
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ej_7_javapoo_guia7;

import Atributos.Persona;
import Servicios.personaServicios;

/**
 *
 * @author renzo
 */
public class Ej_7_JavaPOO_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        personaServicios srv = new personaServicios();
        int vectorIMC [] = new int[4];
        boolean vectorEdad [] = new boolean[4];
        int contIMC_debajo = 0;
        int contIMC_pesoideal = 0;
        int contIMC_sobrepeso = 0;
        int contEdadMenor = 0;
        int contEdadMayor = 0;
        

        System.out.println("Agregar valores de persona 1.");
        srv.crearPersona(p1);
        vectorIMC[0] = srv.calcularIMC(p1);
        vectorEdad[0] = srv.esMayorDeEdad(p1);
        System.out.println("Agregar valores de persona 2.");
        srv.crearPersona(p2);
        vectorIMC[1] = srv.calcularIMC(p2);
        vectorEdad [1] = srv.esMayorDeEdad(p2);
        System.out.println("Agregar valores de persona 3.");
        srv.crearPersona(p3);
        vectorIMC[2] = srv.calcularIMC(p3);
        vectorEdad [2] = srv.esMayorDeEdad(p3);
        System.out.println("Agregar valores de persona 4.");
        srv.crearPersona(p4);
        vectorIMC[3] = srv.calcularIMC(p4);
        vectorEdad [3] = srv.esMayorDeEdad(p4);
        
        for (int i = 0; i < 4; i++) {
            switch (vectorIMC[i]) {
                case -1:
                    contIMC_debajo ++;
                    break;
                case 0:
                    contIMC_pesoideal ++;
                    break;
                default:
                    contIMC_sobrepeso ++;
                    break;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (vectorEdad[i] == true) {
                contEdadMayor ++;
            } else {
                contEdadMenor ++;
            }
        }
        
        System.out.println(contIMC_debajo + "persona/s esta/n por debajo de su peso ideal.");
        System.out.println(contIMC_pesoideal + "persona/s esta/n en su peso ideal.");
        System.out.println(contIMC_sobrepeso + "persona/s tiene/n sobrepeso.");
        System.out.println(contEdadMayor + "persona/s es/son mayor de edad.");
        System.out.println(contEdadMenor + "persona/s es/son menor de edad.");
        
    }

}
