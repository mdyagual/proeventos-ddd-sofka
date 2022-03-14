package ec.com.proeventos.domain.evento.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.Detalle;

public class CrearAnimador extends Command {
    private final AnimadorId animadorId;
    private final Detalle detalle;

    public CrearAnimador(AnimadorId animadorId, Detalle detalle) {
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
