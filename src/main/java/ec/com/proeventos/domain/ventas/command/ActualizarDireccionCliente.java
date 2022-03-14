package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.ClienteId;
import ec.com.proeventos.domain.ventas.valor.Informacion;

public class ActualizarDireccionCliente extends Command {
    private final ClienteId clienteId;
    private final Informacion informacion;

    public ActualizarDireccionCliente(ClienteId clienteId, Informacion informacion) {
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
