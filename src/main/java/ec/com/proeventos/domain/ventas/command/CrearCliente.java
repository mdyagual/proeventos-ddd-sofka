package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.ClienteId;
import ec.com.proeventos.domain.ventas.valor.Informacion;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class CrearCliente extends Command {
    private final VentaId ventaId;
    private final ClienteId clienteId;
    private final Informacion informacion;

    public CrearCliente(VentaId ventaId, ClienteId clienteId, Informacion informacion) {
        this.ventaId = ventaId;
        this.clienteId = clienteId;
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    

    

    

    
}
