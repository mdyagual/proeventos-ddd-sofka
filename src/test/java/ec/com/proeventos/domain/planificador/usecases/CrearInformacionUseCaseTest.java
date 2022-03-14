package ec.com.proeventos.domain.planificador.usecases;

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

import ec.com.proeventos.domain.planificador.Informacion;
import ec.com.proeventos.domain.planificador.Itinerario;
import ec.com.proeventos.domain.planificador.Registro;
import ec.com.proeventos.domain.planificador.command.CrearInformacion;
import ec.com.proeventos.domain.planificador.event.InformacionCreada;
import ec.com.proeventos.domain.planificador.event.PlanificadorCreado;
import ec.com.proeventos.domain.planificador.valor.Descripcion;
import ec.com.proeventos.domain.planificador.valor.Disenio;
import ec.com.proeventos.domain.planificador.valor.Fecha;
import ec.com.proeventos.domain.planificador.valor.InformacionId;
import ec.com.proeventos.domain.planificador.valor.ItinerarioId;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;
import ec.com.proeventos.domain.planificador.valor.RegistroId;
import ec.com.proeventos.domain.planificador.valor.Usuario;
import ec.com.proeventos.domain.venta.valor.VentaId;

@ExtendWith(MockitoExtension.class)
class CrearInformacionUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void CrearInformacion(){
        //Arange
        PlanificadorId planificadorId = PlanificadorId.of("planificador1");
        
        InformacionId informacionId = InformacionId.of("informacion1");
        Usuario usuario = new Usuario("sarita1@mail.com", "Sara", "Elizondo");

        var command = new CrearInformacion(planificadorId,informacionId,usuario);
        
        var useCase = new CrearInformacionUseCase();

        Mockito.when(repository.getEventsBy("planificador1")).thenReturn(history());
        useCase.addRepository(repository);

        //Act  
        var events = UseCaseHandler.getInstance()
        .setIdentifyExecutor(planificadorId.value())
        .syncExecutor(useCase, new RequestCommand<>(command))
        .orElseThrow()
        .getDomainEvents();

         //Asset
         var event = (InformacionCreada) events.get(0);
         Assertions.assertEquals("planificador.informacioncreada", event.type);
         Assertions.assertEquals("planificador1", event.aggregateRootId());
         Assertions.assertEquals(informacionId, event.getInformacionId());
         Assertions.assertEquals(usuario, event.getUsuario());   
 

    }

    private List<DomainEvent> history() {        
        //Informacion, Registro, Itinerario, VentaId
        InformacionId informacionId = InformacionId.of("informacion1");
        Usuario usuario = new Usuario("sarita1@mail.com", "Sara", "Elizondo");
        Informacion informacion = new Informacion(informacionId, usuario);

        RegistroId registroId = RegistroId.of("registro1");
        Descripcion descripcion = new Descripcion("Bautizo Juan David", new Fecha());
        Registro registro = new Registro(registroId,descripcion);

        ItinerarioId itinerarioId = ItinerarioId.of("itinerario1");
        Disenio disenio = new Disenio("Bautizo aire libre", 200, 1500.50);
        Itinerario itinerario = new Itinerario(itinerarioId, disenio);

        VentaId ventaId = VentaId.of("venta1");

        return List.of(
                    new PlanificadorCreado(informacion,registro,itinerario,ventaId),
                    new InformacionCreada(informacionId,usuario)
            );
        
        }
    
}
