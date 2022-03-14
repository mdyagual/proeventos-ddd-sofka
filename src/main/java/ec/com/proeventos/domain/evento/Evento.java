package ec.com.proeventos.domain.evento;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import ec.com.proeventos.domain.evento.valor.EventoId;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

public class Evento extends AggregateEvent<EventoId> {
    protected Celebracion celebracion;
    protected Animador animador;
    protected PlanificadorId planificadorId;
    protected List<Salonero> saloneros;

    public Evento(EventoId entityId, Celebracion celebracion, Animador animador, PlanificadorId planificadorId) {
        super(entityId);
        
    }

    
}
