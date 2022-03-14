package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.valor.Disenio;

public class ItinerarioCreado extends DomainEvent {
    private final Disenio disenio;

    public ItinerarioCreado(Disenio disenio){
        super("planificador.itinerariocreado");
        this.disenio = disenio;
        
    }

    public Disenio getDisenio() {
        return disenio;
    }

}
