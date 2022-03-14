package ec.com.proeventos.domain.planificador.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.planificador.Planificador;
import ec.com.proeventos.domain.planificador.command.CrearPlanificador;

public class CrearPlanificadorUseCase extends UseCase<RequestCommand<CrearPlanificador>,ResponseEvents>{
     
    @Override
    public void executeUseCase(RequestCommand<CrearPlanificador> input){
        var command = input.getCommand();
        var planificador = new Planificador(command.getPlanificadorId(), command.getInformacion(),command.getRegistro(), command.getItinerario(),command.getVentaId());      
        emit().onResponse(new ResponseEvents(planificador.getUncommittedChanges()));
    }
}
