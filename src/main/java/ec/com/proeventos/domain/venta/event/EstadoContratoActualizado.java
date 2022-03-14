package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Estado;

public class EstadoContratoActualizado extends DomainEvent {
    private final ContratoId contratoId;
    private final Estado estado;

    public EstadoContratoActualizado(ContratoId contratoId, Estado estado) {
        super("ventas.estadocontratoactualizado");
        this.contratoId = contratoId;
        this.estado = estado;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Estado getEstado() {
        return estado;
    }

}
