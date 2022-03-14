package ec.com.proeventos.domain.planificador.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.planificador.Planificador;
import ec.com.proeventos.domain.planificador.command.CrearRegistro;

public class CrearRegistroUseCase extends UseCase<RequestCommand<CrearRegistro>,ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearRegistro> input){
        var command = input.getCommand();

        var planificador = Planificador.from(command.getPlanificadorId(), retrieveEvents());

        planificador.crearRegistro(command.getRegistroId(), command.getDescripcion());
        emit().onResponse(new ResponseEvents(planificador.getUncommittedChanges()));
    }
}
