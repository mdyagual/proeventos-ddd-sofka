package ec.com.proeventos.domain.venta;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.event.ClienteCreado;
import ec.com.proeventos.domain.venta.event.ContratoActualizado;
import ec.com.proeventos.domain.venta.event.ContratoCreado;
import ec.com.proeventos.domain.venta.event.DatosVendedorActualizado;
import ec.com.proeventos.domain.venta.event.DireccionClienteActualizado;
import ec.com.proeventos.domain.venta.event.EstadoContratoActualizado;
import ec.com.proeventos.domain.venta.event.InformacionClienteActualizado;
import ec.com.proeventos.domain.venta.event.PagoContratoActualizado;
import ec.com.proeventos.domain.venta.event.VendedorCreado;
import ec.com.proeventos.domain.venta.event.VentaCreada;
import ec.com.proeventos.domain.venta.valor.ClienteId;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.Estado;
import ec.com.proeventos.domain.venta.valor.Fecha;
import ec.com.proeventos.domain.venta.valor.Informacion;
import ec.com.proeventos.domain.venta.valor.Pago;
import ec.com.proeventos.domain.venta.valor.VendedorId;
import ec.com.proeventos.domain.venta.valor.VentaId;

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

    //---------------Eventos: Creación
    public void crearVendedor(VendedorId vendedorId, Dato datos){
        appendChange(new VendedorCreado(vendedorId,datos)).apply();
    }

    public void crearCliente(ClienteId clienteId, Informacion informacion){
        appendChange(new ClienteCreado(clienteId,informacion)).apply();
    }

    public void crearContrato(ContratoId contratoId, Double total){
        appendChange(new ContratoCreado(contratoId,total)).apply();
    }

    
    //---------------Eventos: Actualización
    public void actualizarContrato(ContratoId contratoId, Double total){
        appendChange(new ContratoActualizado(contratoId,total)).apply();
    }

    public void actualizarInformacionCliente(ClienteId clienteId, Informacion info){
        appendChange(new InformacionClienteActualizado(clienteId,info)).apply();
    }

    public void actualizarDireccionCliente(ClienteId clienteId,Informacion info){
        appendChange(new DireccionClienteActualizado(clienteId,info)).apply();
    }

    public void actualizarDatosVendedor(VendedorId vendedorId, Dato datos){
        appendChange(new DatosVendedorActualizado(vendedorId,datos)).apply();
    }

   
    public void actualizarPagoContrato(ContratoId contratoId, Pago pago){
        appendChange(new PagoContratoActualizado(contratoId,pago)).apply();
    }

    public void actualizarEstadoContrato(ContratoId contratoId, Estado estado){
        appendChange(new EstadoContratoActualizado(contratoId, estado)).apply();
    }

   

   

    

}
