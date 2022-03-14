package ec.com.proeventos.domain.venta.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Pago;

public class PagoContratoActualizado extends DomainEvent{
    private final ContratoId contratoId;
    private final Pago pago;

    public PagoContratoActualizado(ContratoId contratoId, Pago pago) {
        super("venta.pagocontratoactualizado");
        this.contratoId = contratoId;
        this.pago = pago;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Pago getPago() {
        return pago;
    }

    

    

}
