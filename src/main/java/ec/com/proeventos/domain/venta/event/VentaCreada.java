package ec.com.proeventos.domain.venta.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.Cliente;
import ec.com.proeventos.domain.venta.Contrato;
import ec.com.proeventos.domain.venta.Vendedor;

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

