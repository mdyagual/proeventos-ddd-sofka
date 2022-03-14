package ec.com.proeventos.domain.evento.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.evento.valor.CelebracionId;
import ec.com.proeventos.domain.evento.valor.Duracion;
import ec.com.proeventos.domain.evento.valor.Lugar;

public class CelebracionCreada extends DomainEvent {
    private final CelebracionId celebracionId;
    private final Lugar lugar;
    private final Duracion duracion;

    public CelebracionCreada(CelebracionId celebracionId, Lugar lugar, Duracion duracion) {
        super("evento.celebracioncreada");
        this.celebracionId = celebracionId;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    

    public CelebracionId getCelebracionId() {
        return celebracionId;
    }



    public Lugar getLugar() {
        return lugar;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    
    
    
}
