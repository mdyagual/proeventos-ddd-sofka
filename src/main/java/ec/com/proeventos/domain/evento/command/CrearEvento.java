package ec.com.proeventos.domain.evento.command;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.evento.Animador;
import ec.com.proeventos.domain.evento.Celebracion;
import ec.com.proeventos.domain.evento.Salonero;
import ec.com.proeventos.domain.evento.valor.EventoId;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

public class CrearEvento extends Command{
    private final EventoId eventoId;
    private final Celebracion celebracion;
    private final Animador animador;
    private final PlanificadorId planificadorId;
    private final List<Salonero> saloneros;
    
    public CrearEvento(EventoId eventoId, Celebracion celebracion, Animador animador, PlanificadorId planificadorId) {
        this.eventoId = eventoId;
        this.celebracion = celebracion;
        this.animador = animador;
        this.planificadorId = planificadorId;
        this.saloneros = new ArrayList<>();
    }

    public EventoId getEventoId() {
        return eventoId;
    }

    public Celebracion getCelebracion() {
        return celebracion;
    }

    public Animador getAnimador() {
        return animador;
    }

    public PlanificadorId getPlanificadorId() {
        return planificadorId;
    }

    public List<Salonero> getSaloneros() {
        return saloneros;
    }

    

    
    
}
