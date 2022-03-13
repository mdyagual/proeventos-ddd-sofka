package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Reporte;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class ReporteVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Reporte reporte;

    public ReporteVendedorActualizado(VendedorId vendedorId, Reporte reporte) {
        super("venta.reportevendedoractualizado");
        this.vendedorId = vendedorId;
        this.reporte = reporte;
    }
    

    public VendedorId getVendedorId() {
        return vendedorId;
    }
    public Reporte getReporte() {
        return reporte;
    }



    
    

    
}
