package ec.com.proeventos.domain.evento.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.Detalle;
import ec.com.proeventos.domain.evento.valor.EventoId;

public class CrearAnimador extends Command {
    private final EventoId eventoId;
    private final AnimadorId animadorId;
    private final Detalle detalle;

    public CrearAnimador(EventoId eventoId,AnimadorId animadorId, Detalle detalle) {
        this.eventoId = eventoId;
        this.animadorId = animadorId;
        this.detalle = detalle;
    }

    public AnimadorId getAnimadorId() {
        return animadorId;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public EventoId getEventoId() {
        return eventoId;
    }

    
    

    

    

    
    
}
