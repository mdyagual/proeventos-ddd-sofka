package ec.com.proeventos.domain.evento.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.Detalle;

public class AnimadorCreado extends DomainEvent {
    private final AnimadorId animadorId;
    private final Detalle detalle;

    public AnimadorCreado(AnimadorId animadorId, Detalle detalle) {
        super("evento.animadorcreado");
        this.animadorId = animadorId;
        this.detalle = detalle;
    }

    

    public AnimadorId getAnimadorId() {
        return animadorId;
    }



    public Detalle getDetalle() {
        return detalle;
    }

    
    
    
}
