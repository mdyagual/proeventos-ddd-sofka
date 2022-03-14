package ec.com.proeventos.domain.planificador.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import ec.com.proeventos.domain.planificador.Informacion;
import ec.com.proeventos.domain.planificador.Itinerario;
import ec.com.proeventos.domain.planificador.Registro;
import ec.com.proeventos.domain.planificador.command.CrearPlanificador;
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

class CrearPlanificadorUseCaseTest {
    @Test
    void crearPlanificador(){
        //Arange
        PlanificadorId planificadorId = PlanificadorId.of("planificador1");
        
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

        CrearPlanificador planificador = new CrearPlanificador(planificadorId, informacion, registro, itinerario, ventaId);

        //Act
        CrearPlanificadorUseCase useCase = new CrearPlanificadorUseCase();

        var events = UseCaseHandler.getInstance()
        .syncExecutor(useCase, new RequestCommand<>(planificador))
        .orElseThrow()
        .getDomainEvents();

         //Asset
         var event = (PlanificadorCreado) events.get(0);
         Assertions.assertEquals("planificador.planificadorcreado", event.type);
         Assertions.assertEquals("planificador1", event.aggregateRootId());
         Assertions.assertEquals(informacion, event.getInformacion());
         Assertions.assertEquals(registro, event.getRegistro());
         Assertions.assertEquals(itinerario, event.getItinerario());
         Assertions.assertEquals(ventaId, event.getVentaId());


    }
    
}
