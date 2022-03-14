package ec.com.proeventos.domain.evento.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import ec.com.proeventos.domain.evento.Animador;
import ec.com.proeventos.domain.evento.Celebracion;
import ec.com.proeventos.domain.evento.command.CrearEvento;
import ec.com.proeventos.domain.evento.event.EventoCreado;
import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.CelebracionId;
import ec.com.proeventos.domain.evento.valor.Detalle;
import ec.com.proeventos.domain.evento.valor.Duracion;
import ec.com.proeventos.domain.evento.valor.EventoId;
import ec.com.proeventos.domain.evento.valor.Lugar;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;

class CrearEventoUseCaseTest {
    @Test
    void crearEvento(){
        //Arange
        EventoId eventoId = EventoId.of("evento1");

        //id,Celebracion,Animador,PlanificadorId
        CelebracionId celebracionId = CelebracionId.of("celebracion1");
        Lugar lugar = new Lugar("LugarX", "DireccionX", 500);
        Duracion duracion = new Duracion("8H00", "10H00");
        Celebracion celebracion = new Celebracion(celebracionId, lugar, duracion);

        AnimadorId animadorId=AnimadorId.of("animador1");
        Detalle detalle = new Detalle("NombreX", "ApellidoX", "M");
        Animador animador = new Animador(animadorId, detalle);

        PlanificadorId planificadorId = PlanificadorId.of("planificador1");

        CrearEvento evento = new CrearEvento(eventoId, celebracion, animador, planificadorId);

        //Act
        CrearEventoUseCase useCase = new CrearEventoUseCase();

        var events = UseCaseHandler.getInstance()
        .syncExecutor(useCase, new RequestCommand<>(evento))
        .orElseThrow()
        .getDomainEvents();

         //Asset
         var event = (EventoCreado) events.get(0);
         Assertions.assertEquals("evento.eventocreado", event.type);
         Assertions.assertEquals("evento1", event.aggregateRootId());
         Assertions.assertEquals(celebracion, event.getCelebracion());
         Assertions.assertEquals(animador, event.getAnimador());
         Assertions.assertEquals(planificadorId, event.getPlanficadorId());

    }
    
}
