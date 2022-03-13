package ec.com.proeventos.domain.ventas;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.event.ClienteCreado;
import ec.com.proeventos.domain.ventas.event.ContratoCreado;
import ec.com.proeventos.domain.ventas.event.VendedorCreado;
import ec.com.proeventos.domain.ventas.event.VentaCreada;
import ec.com.proeventos.domain.ventas.valor.ClienteId;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.Informacion;
import ec.com.proeventos.domain.ventas.valor.VendedorId;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class Venta extends AggregateEvent<VentaId>{
    protected Cliente cliente;
    protected Vendedor vendedor;
    protected Contrato contrato;
    protected Fecha fecha;

    //Initial

    public Venta (VentaId ventaId, Vendedor vendedor, Cliente cliente, Contrato contrato){
        super(ventaId);
        appendChange(new VentaCreada(vendedor, cliente, contrato)).apply();
        subscribe(new VentaEventChange(this));
    }

    private Venta(VentaId ventaId){
        super(ventaId);
        subscribe(new VentaEventChange(this));
    }

    public static Venta from (VentaId ventaId, List<DomainEvent>events){
        var venta = new Venta(ventaId);
        events.forEach(venta::applyEvent);
        return venta;
    }

    //Eventos: Creación
    public void crearVendedor(VendedorId vendedorId, Dato datos){
        appendChange(new VendedorCreado(vendedorId,datos)).apply();
    }

    public void crearCliente(ClienteId clienteId, Informacion informacion){
        appendChange(new ClienteCreado(clienteId,informacion)).apply();
    }

    public void crearContrato(ContratoId contratoId, Double total){
        appendChange(new ContratoCreado(contratoId,total)).apply();
    }
    

}
