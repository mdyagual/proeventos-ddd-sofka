package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class ReporteVendedorEliminado extends DomainEvent {
    private final VendedorId vendedorId;

    public ReporteVendedorEliminado(VendedorId vendedorId) {
        super("venta.reportevendedoreliminado");
        this.vendedorId = vendedorId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    

    
    
}
