package ec.com.proeventos.domain.venta;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.VendedorId;

public class Vendedor extends Entity<VendedorId> {
    private Dato datos;

    public Vendedor (VendedorId vendedorId, Dato datos){
        super(vendedorId);
        this.datos = datos;
    }

    public Dato datos(){
        return datos;
    }

   
    
    //actualizar Datos
    public void actualizarDatos(Dato d){
        this.datos = d;
    }
    


}
