package ec.com.proeventos.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.ventas.Venta;
import ec.com.proeventos.domain.ventas.command.CrearCliente;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCliente> input){
        var command = input.getCommand();

        var venta = Venta.from(command.getVentaId(), retrieveEvents());

        venta.crearCliente(command.getClienteId(), command.getInformacion());
        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }

    
}
