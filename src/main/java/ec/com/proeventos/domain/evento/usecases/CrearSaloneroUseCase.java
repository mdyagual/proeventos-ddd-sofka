package ec.com.proeventos.domain.evento.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.evento.Evento;
import ec.com.proeventos.domain.evento.command.CrearSalonero;

public class CrearSaloneroUseCase extends UseCase<RequestCommand<CrearSalonero>,ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearSalonero> input){
        var command = input.getCommand();

        var evento = Evento.from(command.getEventoId(), retrieveEvents());

        if(evento.saloneros().size() >= 10){
            throw new BusinessException(command.getEventoId().value(), "No se puede agregar mas de 10 saloneros por evento");
        }

        evento.CrearSalonero(command.getSaloneroId(),command.getNombre(), command.getApellido(), command.getTurno());
        emit().onResponse(new ResponseEvents(evento.getUncommittedChanges()));
    }
}
