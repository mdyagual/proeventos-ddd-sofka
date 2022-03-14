package ec.com.proeventos.domain.ventas.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.ventas.Venta;

import ec.com.proeventos.domain.ventas.command.CrearVendedor;

public class CreaVendedorUseCase extends UseCase<RequestCommand<CrearVendedor>, ResponseEvents>  {
    @Override
    public void executeUseCase(RequestCommand<CrearVendedor> input){
        var command = input.getCommand();

        var venta = Venta.from(command.getVentaId(), retrieveEvents());

        venta.crearVendedor(command.getVendedorId(), command.getDatos());
        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }

}
