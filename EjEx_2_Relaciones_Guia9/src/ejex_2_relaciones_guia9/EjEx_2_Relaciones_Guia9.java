/*
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package ejex_2_relaciones_guia9;
import Servicios.servicio;
/**
 *
 * @author renzo
 */
public class EjEx_2_Relaciones_Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicio srv = new servicio();
        srv.crearCine();
        srv.cartelera();
    }
    
}
