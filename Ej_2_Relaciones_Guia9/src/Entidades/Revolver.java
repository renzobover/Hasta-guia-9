/*
esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual.
• siguienteChorro(): cambia a la siguiente posición del tambor.
• toString(): muestra información del revolver (posición actual y donde está el agua).
 */
package Entidades;

/**
 *
 * @author renzo
 */
public class Revolver {
    
    private int posicion_actual;
    private int posicion_agua;
    

    public Revolver() {
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }    
    
    
    
    public void llenarRevolver(){
        posicion_actual = ((int)(Math.random()*6+1));
        posicion_agua = ((int)(Math.random()*6+1));
//        System.out.println(getPosicion_actual());
//        System.out.println(getPosicion_agua());
    }
    
    public boolean mojar(){
//        System.out.println("Metodo mojar");
//        System.out.println(getPosicion_actual());
//        System.out.println(getPosicion_agua());
        boolean vof = false;
        if (posicion_actual == posicion_agua){
            vof = true;
        }
        return vof;
    }
    
    public void siguienteChorro(){
        if (posicion_actual == 6) {
            posicion_actual = 1;
        } else {
            posicion_actual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver" + "Posicion actual = " + posicion_actual + "|| posicion_agua = " + posicion_agua;
    }
    
    
}
