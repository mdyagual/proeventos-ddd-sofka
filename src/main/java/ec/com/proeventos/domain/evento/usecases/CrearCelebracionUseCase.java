package ec.com.proeventos.domain.evento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.evento.Evento;
import ec.com.proeventos.domain.evento.command.CrearCelebracion;

public class CrearCelebracionUseCase extends UseCase<RequestCommand<CrearCelebracion>,ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearCelebracion> input){
        var command = input.getCommand();

        var evento = Evento.from(command.getEventoId(), retrieveEvents());

        evento.crearCelebracion(command.getCelebracionId(), command.getLugar(),command.getDuracion());
        emit().onResponse(new ResponseEvents(evento.getUncommittedChanges()));
    }
}
