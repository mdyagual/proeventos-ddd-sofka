package ec.com.proeventos.domain.evento.usecases;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;

import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.CelebracionId;
import ec.com.proeventos.domain.evento.valor.Detalle;
import ec.com.proeventos.domain.evento.valor.Duracion;
import ec.com.proeventos.domain.evento.valor.EventoId;
import ec.com.proeventos.domain.evento.valor.Lugar;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;
import ec.com.proeventos.domain.evento.Animador;
import ec.com.proeventos.domain.evento.Celebracion;
import ec.com.proeventos.domain.evento.command.CrearCelebracion;
import ec.com.proeventos.domain.evento.event.CelebracionCreada;
import ec.com.proeventos.domain.evento.event.EventoCreado;

@ExtendWith(MockitoExtension.class)
class CrearCelebracionUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void CrearCelebracion(){
        //Arange
        EventoId eventoId = EventoId.of("evento1");

        CelebracionId celebracionId = CelebracionId.of("celebracion1");
        Lugar lugar = new Lugar("LugarX", "DireccionX", 500);
        Duracion duracion = new Duracion("8H00", "10H00");

        var command = new CrearCelebracion(eventoId,celebracionId,lugar,duracion);
        
        var useCase = new CrearCelebracionUseCase();

        Mockito.when(repository.getEventsBy("evento1")).thenReturn(history());
        useCase.addRepository(repository);

         //Act  
         var events = UseCaseHandler.getInstance()
         .setIdentifyExecutor(eventoId.value())
         .syncExecutor(useCase, new RequestCommand<>(command))
         .orElseThrow()
         .getDomainEvents();
 
         //Asset
         var event = (CelebracionCreada) events.get(0);
         Assertions.assertEquals("evento.celebracioncreada", event.type);
         Assertions.assertEquals("evento1", event.aggregateRootId());
         Assertions.assertEquals(celebracionId, event.getCelebracionId());
         Assertions.assertEquals(lugar, event.getLugar());   
         Assertions.assertEquals(duracion, event.getDuracion());   
 
    }
    
    private List<DomainEvent> history() {        
        //id,Celebracion,Animador,PlanificadorId
        CelebracionId celebracionId = CelebracionId.of("celebracion1");
        Lugar lugar = new Lugar("LugarX", "DireccionX", 500);
        Duracion duracion = new Duracion("8H00", "10H00");
        Celebracion celebracion = new Celebracion(celebracionId, lugar, duracion);

        AnimadorId animadorId=AnimadorId.of("animador1");
        Detalle detalle = new Detalle("NombreX", "ApellidoX", "M");
        Animador animador = new Animador(animadorId, detalle);

        PlanificadorId planficadorId = PlanificadorId.of("planificador1");
        

        return List.of(
                    new EventoCreado(planficadorId, celebracion, animador),
                    new CelebracionCreada(celebracionId,lugar,duracion)
            );
        
        }
    
}
