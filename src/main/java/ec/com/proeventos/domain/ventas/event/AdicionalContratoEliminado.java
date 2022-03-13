package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.ContratoId;

public class AdicionalContratoEliminado extends DomainEvent {
    private final ContratoId contratoId;

    public AdicionalContratoEliminado(ContratoId contratoId){
        super("venta.adicionalcontratoeliminado");
        this.contratoId = contratoId;

    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    
}
