package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.Cliente;
import ec.com.proeventos.domain.ventas.Contrato;
import ec.com.proeventos.domain.ventas.Vendedor;

public class VentaCreada extends DomainEvent {
    private final Vendedor vendedor;
    private final Cliente cliente;
    private final Contrato contrato;
    
    public VentaCreada(Vendedor vendedor, Cliente cliente, Contrato contrato) {
        super("venta.ventacreada");
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.contrato = contrato;
    }

    

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Contrato getContrato() {
        return contrato;
    }

    
    

}

