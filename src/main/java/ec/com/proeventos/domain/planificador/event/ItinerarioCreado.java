package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.valor.Disenio;
import ec.com.proeventos.domain.planificador.valor.ItinerarioId;

public class ItinerarioCreado extends DomainEvent {
    private final ItinerarioId itinerarioId;
    private final Disenio disenio;

    public ItinerarioCreado(ItinerarioId itinerarioId, Disenio disenio){
        super("planificador.itinerariocreado");
        this.itinerarioId = itinerarioId;
        this.disenio = disenio;
        
    }

    public Disenio getDisenio() {
        return disenio;
    }

    public ItinerarioId getItinerarioId() {
        return itinerarioId;
    }

    

}
