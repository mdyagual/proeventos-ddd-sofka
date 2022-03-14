package ec.com.proeventos.domain.planificador.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.planificador.Planificador;
import ec.com.proeventos.domain.planificador.command.CrearItinerario;

public class CrearItinerarioUseCase extends UseCase<RequestCommand<CrearItinerario>,ResponseEvents>  {
    @Override
    public void executeUseCase(RequestCommand<CrearItinerario> input){
        var command = input.getCommand();

        var planificador = Planificador.from(command.getPlanificadorId(), retrieveEvents());

        planificador.crearItinerario(command.getItinerarioId(), command.getDisenio());
        emit().onResponse(new ResponseEvents(planificador.getUncommittedChanges()));
    }

}
