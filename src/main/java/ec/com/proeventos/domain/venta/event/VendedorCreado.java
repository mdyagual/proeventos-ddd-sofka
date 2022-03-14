package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class VendedorCreado extends DomainEvent{
    
    private final VendedorId vendedorId;
    private final Dato datos;


    public VendedorCreado(VendedorId vendedorId, Dato datos) {
        super("venta.vendedorcreado");
        this.vendedorId = vendedorId;
        this.datos = datos;
    }


    public VendedorId getVendedorId() {
        return vendedorId;
    }


    public Dato getDatos() {
        return datos;
    }
    
    
    
}
