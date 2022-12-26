/*
 a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Atributos.Cadena;
import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class cadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c1 = new Cadena();

    public Cadena ingresarPalabra(Cadena c1) {

        System.out.print("Ingrese una palabra o frase: ");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        return c1;
    }

    public void mostrarVocales(Cadena c1) {
        System.out.println("Muesta de vocales|||");
        for (int i = 0; i < c1.getLongitud() - 1; i++) {
            if ("a".equalsIgnoreCase(c1.getFrase().substring(i, i + 1)) || "e".equalsIgnoreCase(c1.getFrase().substring(i, i + 1))
                    || "i".equalsIgnoreCase(c1.getFrase().substring(i, i + 1)) || "o".equalsIgnoreCase(c1.getFrase().substring(i, i + 1))
                    || "u".equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                System.out.print(" - " + c1.getFrase().substring(i, i + 1));
            }
        }
        System.out.println(" ");
    }

    public void invertirFrase(Cadena c1) {
        for (int i = c1.getLongitud(); i > 0; i--) {
            System.out.print(c1.getFrase().substring(i-1, i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c1) {
        String letra;
        int cont = 0;
        System.out.print("Ingrese una letra para ver cuantas veces se repite en la frase: ");
        letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        System.out.println("El caracter " + "[" + letra + "]" + " se repite " + cont + " veces.");
        System.out.println("");
    }
    
    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese una nueva frase para comparar la longitud con la frase anterior: ");
        String frase = leer.next();
        int longitud = frase.length();
        System.out.println("La longitud de la frase original es de " + c1.getLongitud() + 
        " caracteres, mientras que la longitud de la nueva frase ingresada es de " + longitud + " caracteres.");
        System.out.println("");
    }
    
    public void unirFrase(Cadena c1){
    System.out.println("Ingrese una nueva frase para concatenarla a la frase anterior: ");
    String frase = leer.next();
        System.out.println(c1.getFrase().concat(" " + frase));
        System.out.println("");
    }
    
    public void reemplazarLetra(Cadena c1){
        System.out.println("Ingrese un caracter para reemplazarlo por todas las letras 'a' que se encuentren en la frase original: ");
        String letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ("a".equalsIgnoreCase(c1.getFrase().substring(i, i+1))) {
                System.out.print(letra);
            }
            else{
                System.out.print(c1.getFrase().substring(i, i+1));}
        }
        System.out.println("");
    }
    
    public void contieneLetra(Cadena c1){
        System.out.print("Ingrese una letra para saber si la contiene la frase o no: ");
        String letra = leer.next();
        boolean vof = false;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c1.getFrase().substring(i, i+1))) {
                vof = true;
            }
        }
        System.out.println(vof);
    }
}
