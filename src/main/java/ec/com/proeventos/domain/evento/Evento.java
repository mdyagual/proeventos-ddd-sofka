package ec.com.proeventos.domain.evento;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.evento.event.AnimadorCreado;
import ec.com.proeventos.domain.evento.event.CelebracionCreada;
import ec.com.proeventos.domain.evento.event.EventoCreado;
import ec.com.proeventos.domain.evento.event.SaloneroCreado;
import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.CelebracionId;
import ec.com.proeventos.domain.evento.valor.Detalle;
import ec.com.proeventos.domain.evento.valor.Duracion;
import ec.com.proeventos.domain.evento.valor.EventoId;
import ec.com.proeventos.domain.evento.valor.Lugar;
import ec.com.proeventos.domain.evento.valor.SaloneroId;
import ec.com.proeventos.domain.evento.valor.Turno;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

public class Evento extends AggregateEvent<EventoId> {
    protected Celebracion celebracion;
    protected Animador animador;
    protected PlanificadorId planificadorId;
    protected List<Salonero> saloneros;

    public Evento(EventoId entityId, Celebracion celebracion, Animador animador, PlanificadorId planificadorId) {
        super(entityId);
        appendChange(new EventoCreado(planificadorId,celebracion, animador));
        subscribe(new EventoEventChange(this));
    }

    private Evento(EventoId eventoId){
        super(eventoId);
        subscribe(new EventoEventChange(this));
    }

    public static Evento from (EventoId eventoId, List<DomainEvent> events){
        var planficador = new Evento(eventoId);
        events.forEach(planficador::applyEvent);
        return planficador;
    }

    //---------------Eventos: Crear
    public void crearCelebracion(CelebracionId celebracionId, Lugar lugar, Duracion duracion){
        appendChange(new CelebracionCreada(celebracionId, lugar, duracion)).apply();

    }

    public void crearAnimador(AnimadorId animadorId, Detalle detalle){
        appendChange(new AnimadorCreado(animadorId, detalle)).apply();
    }

    public void CrearSalonero(SaloneroId saloneroId, String nombre, String apellido, Turno turno){
        appendChange(new SaloneroCreado(saloneroId, nombre, apellido, turno)).apply();

    }

    public List<Salonero> saloneros(){
        return saloneros;
    }
    

    
}
