package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.ContratoId;

public class AdicionalContratoAgregado extends DomainEvent {
    private final ContratoId contratoId;
    private final Adicional adicional;

    public AdicionalContratoAgregado(ContratoId contratoId, Adicional adicional){
        super("venta.adicionalcontratoagregado");
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
