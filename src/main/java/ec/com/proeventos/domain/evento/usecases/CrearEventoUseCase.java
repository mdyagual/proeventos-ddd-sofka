package ec.com.proeventos.domain.evento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.evento.Evento;
import ec.com.proeventos.domain.evento.command.CrearEvento;

public class CrearEventoUseCase extends UseCase<RequestCommand<CrearEvento>,ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEvento> input){
        var command = input.getCommand();
        var planificador = new Evento(command.getEventoId(), command.getCelebracion() ,command.getAnimador(), command.getPlanificadorId());      
        emit().onResponse(new ResponseEvents(planificador.getUncommittedChanges()));
    }
}
