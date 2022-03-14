package ec.com.proeventos.domain.evento.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.evento.Animador;
import ec.com.proeventos.domain.evento.Celebracion;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

public class EventoCreado extends DomainEvent{
    private final PlanificadorId planficadorId;
    private final Celebracion celebracion;
    private final Animador animador;

    public EventoCreado(PlanificadorId planficadorId,Celebracion celebracion,Animador animador) {
        super("evento.eventocreado");
        this.planficadorId = planficadorId;
        this.celebracion = celebracion;
        this.animador = animador;
    }

    public PlanificadorId getPlanficadorId() {
        return planficadorId;
    }

    public Celebracion getCelebracion() {
        return celebracion;
    }

    public Animador getAnimador() {
        return animador;
    }

    


    
}
