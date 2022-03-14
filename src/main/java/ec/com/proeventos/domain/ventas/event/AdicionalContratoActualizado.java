package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.ContratoId;

public class AdicionalContratoActualizado extends DomainEvent{
    private final ContratoId contratoId;
    private final Adicional adicional;

    public AdicionalContratoActualizado(ContratoId contratoId, Adicional adicional) {
        super("ventas.adicionalcontratoactualizado");
        this.contratoId = contratoId;
        this.adicional = adicional;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Adicional getAdicional() {
        return adicional;
    }

    

    
    
}
