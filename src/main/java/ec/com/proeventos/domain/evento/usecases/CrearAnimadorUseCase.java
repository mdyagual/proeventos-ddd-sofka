package ec.com.proeventos.domain.evento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.evento.Evento;
import ec.com.proeventos.domain.evento.command.CrearAnimador;

public class CrearAnimadorUseCase extends UseCase<RequestCommand<CrearAnimador>,ResponseEvents>  {
    @Override
    public void executeUseCase(RequestCommand<CrearAnimador> input){
        var command = input.getCommand();

        var evento = Evento.from(command.getEventoId(), retrieveEvents());

        evento.crearAnimador(command.getAnimadorId(), command.getDetalle());
        emit().onResponse(new ResponseEvents(evento.getUncommittedChanges()));
    }
    
}
