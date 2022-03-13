package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.Reporte;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class ReporteVendedorAgregado extends DomainEvent{
    private final VendedorId vendedorId;
    private final Dato datos;
    private final Reporte reporte;

    public ReporteVendedorAgregado (VendedorId vendedorId, Dato datos, Reporte reporte){
        super("venta.reportevendedoragregado");
        this.vendedorId = vendedorId;
        this.datos = datos;
        this.reporte = reporte;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Dato getDatos() {
        return datos;
    }

    public Reporte getReporte() {
        return reporte;
    }

    

    
}
