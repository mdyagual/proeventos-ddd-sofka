package ec.com.proeventos.domain.planificador.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.planificador.valor.Disenio;
import ec.com.proeventos.domain.planificador.valor.ItinerarioId;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

public class CrearItinerario extends Command {
    private final PlanificadorId planificadorId;
    private final ItinerarioId itinerarioId;
    private final Disenio disenio;

    public CrearItinerario(PlanificadorId planificadorId, ItinerarioId itinerarioId, Disenio disenio) {
        this.planificadorId = planificadorId;
        this.itinerarioId = itinerarioId;

        this.disenio = disenio;
    }

    public ItinerarioId getItinerarioId() {
        return itinerarioId;
    }

    public Disenio getDisenio() {
        return disenio;
    }

    public PlanificadorId getPlanificadorId() {
        return planificadorId;
    }

    
    

    

    
}
