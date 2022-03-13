package ec.com.proeventos.domain.ventas;

import co.com.sofka.domain.generic.AggregateEvent;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class Venta extends AggregateEvent<VentaId>{
    protected Cliente cliente;
    protected Vendedor vendedor;
    protected Contrato contrato;
    protected Fecha fecha;

    public Venta (VentaId ventaId, Vendedor vendedor){
        super(ventaId);
    }

}
