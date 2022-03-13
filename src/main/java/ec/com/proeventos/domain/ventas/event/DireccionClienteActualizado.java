package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.ClienteId;
import ec.com.proeventos.domain.ventas.valor.Informacion;

public class DireccionClienteActualizado extends DomainEvent {
    private ClienteId clienteId;
    private Informacion informacion;

    public DireccionClienteActualizado(ClienteId clienteId ,Informacion informacion) {
        super("venta.direccionclienteactualizado");
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
