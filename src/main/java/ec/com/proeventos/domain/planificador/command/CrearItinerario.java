package ec.com.proeventos.domain.planificador.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.planificador.valor.Disenio;
import ec.com.proeventos.domain.planificador.valor.ItinerarioId;

public class CrearItinerario extends Command {
    private final ItinerarioId itinerarioId;
    private final Disenio disenio;

    public CrearItinerario(ItinerarioId itinerarioId, Disenio disenio) {
        this.itinerarioId = itinerarioId;
        this.disenio = disenio;
    }

    public ItinerarioId getItinerarioId() {
        return itinerarioId;
    }

    public Disenio getDisenio() {
        return disenio;
    }

    

    

    
}
