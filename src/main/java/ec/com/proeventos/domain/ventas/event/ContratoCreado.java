package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.ContratoId;

public class ContratoCreado extends DomainEvent{
    private final ContratoId contratoId;
    private final Double total;

    public ContratoCreado(ContratoId contratoId, Double total){
        super("venta.contratocreado");
        this.contratoId = contratoId;
        this.total = total;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Double getTotal() {
        return total;
    }

    
}
