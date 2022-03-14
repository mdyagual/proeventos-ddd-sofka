package ec.com.proeventos.domain.venta.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.valor.ContratoId;

public class ContratoActualizado extends DomainEvent{
    private final ContratoId contratoId;
    private final Double total;

    public ContratoActualizado(ContratoId contratoId, Double total){
        super("venta.contratoactualizado");
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
