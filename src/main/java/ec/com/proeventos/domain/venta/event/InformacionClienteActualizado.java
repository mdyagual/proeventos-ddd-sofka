package ec.com.proeventos.domain.venta.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.valor.ClienteId;
import ec.com.proeventos.domain.venta.valor.Informacion;

public class InformacionClienteActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final Informacion informacion;

    public InformacionClienteActualizado(ClienteId clienteId ,Informacion informacion) {
        super("venta.informacionclienteactualizado");
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
