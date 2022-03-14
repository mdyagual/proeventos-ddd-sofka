package ec.com.proeventos.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ec.com.proeventos.domain.ventas.Venta;
import ec.com.proeventos.domain.ventas.command.CrearVenta;

public class CrearVentaUseCase extends UseCase<RequestCommand<CrearVenta>, ResponseEvents> {
    
    @Override
    public void executeUseCase(RequestCommand<CrearVenta> input){
        var command = input.getCommand();
        var venta = new Venta(command.getVentaId(),command.getVendedor(), command.getCliente(),command.getContrato());      
        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
