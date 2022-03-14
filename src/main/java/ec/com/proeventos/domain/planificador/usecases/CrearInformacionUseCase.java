package ec.com.proeventos.domain.planificador.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.planificador.Planificador;
import ec.com.proeventos.domain.planificador.command.CrearInformacion;

public class CrearInformacionUseCase extends UseCase<RequestCommand<CrearInformacion>,ResponseEvents>  {

    @Override
    public void executeUseCase(RequestCommand<CrearInformacion> input){
        var command = input.getCommand();

        var planificador = Planificador.from(command.getPlanificadorId(), retrieveEvents());

        planificador.crearInformacion(command.getInformacionId(), command.getUsuario());
        emit().onResponse(new ResponseEvents(planificador.getUncommittedChanges()));
    }
    
}
