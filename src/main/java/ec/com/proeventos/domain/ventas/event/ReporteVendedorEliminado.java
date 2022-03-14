package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Reporte;

public class ReporteVendedorEliminado extends DomainEvent {
    private final Reporte reporte;

    public ReporteVendedorEliminado(Reporte reporte) {
        super("venta.reportevendedoreliminado");
        this.reporte = reporte;
    }

    public Reporte getReporte() {
        return reporte;
    }

    

    
    
}
