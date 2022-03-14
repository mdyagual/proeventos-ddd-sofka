package ec.com.proeventos.domain.venta.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.venta.valor.ClienteId;
import ec.com.proeventos.domain.venta.valor.Informacion;

public class ActualizarInformacionCliente extends Command {
    private final ClienteId clienteId;
    private final Informacion informacion;

    

    public ActualizarInformacionCliente(ClienteId clienteId, Informacion informacion) {
        this.clienteId = clienteId;
        this.informacion = informacion;
    }


    public ClienteId getClienteId() {
        return clienteId;
    }

    
    public Informacion getInformacion() {
        return informacion;
    }
}
