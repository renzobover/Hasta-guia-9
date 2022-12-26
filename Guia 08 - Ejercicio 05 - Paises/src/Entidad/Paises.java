
package Entidad;

import java.util.TreeSet;

public class Paises {
    private TreeSet<String> nombrePaises;
    
    public Paises() {
    }

    public Paises(TreeSet<String> nombrePaises) {
        this.nombrePaises = nombrePaises;
    }

    public TreeSet<String> getNombrePaises() {
        return nombrePaises;
    }

    public void setNombrePaises(TreeSet<String> nombrePaises) {
        this.nombrePaises = nombrePaises;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombrePaises=" + nombrePaises + '}';
    }
    
    
       
}
