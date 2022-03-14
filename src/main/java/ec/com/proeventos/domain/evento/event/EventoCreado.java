package ec.com.proeventos.domain.evento.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.Planificador;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

public class EventoCreado extends DomainEvent{
    private final PlanificadorId planficadorId;

    public EventoCreado(String type, PlanificadorId planficadorId) {
        super("evento.eventocreado");
        this.planficadorId = planficadorId;
    }


    
}
