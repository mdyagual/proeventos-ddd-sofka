package ec.com.proeventos.domain.venta.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.VendedorId;

public class DatosVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Dato datos;

    public DatosVendedorActualizado(VendedorId vendedorId, Dato datos){
        super("venta.datosvendedoractualizado");
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
