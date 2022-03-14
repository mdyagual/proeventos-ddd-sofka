package ec.com.proeventos.domain.venta.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.venta.Venta;
import ec.com.proeventos.domain.venta.command.CrearContrato;


public class CrearContratoUseCase extends UseCase<RequestCommand<CrearContrato>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearContrato> input){
        var command = input.getCommand();

        var venta = Venta.from(command.getVentaId(), retrieveEvents());

        venta.crearContrato(command.getContratoId(), command.getTotal());
        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }

}
