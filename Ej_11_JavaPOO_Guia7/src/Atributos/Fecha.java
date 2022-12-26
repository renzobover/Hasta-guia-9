/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author renzo
 */
public class Fecha {
    
    private Date Fecha;

    public Fecha() {
    }

    public Fecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    public String formatoFecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(Fecha);
        return fechaFormateada;
    }
    
    

    





    
    
    

   

    

    
    
    
}
