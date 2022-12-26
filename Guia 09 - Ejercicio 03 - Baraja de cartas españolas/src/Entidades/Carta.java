
package Entidades;

public class Carta {
    private String palo;
    private int numero;

    public Carta() {
    }

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
    
}
