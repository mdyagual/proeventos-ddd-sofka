package ec.com.proeventos.domain.ventas;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.event.InformacionClienteActualizado;
import ec.com.proeventos.domain.ventas.event.PagoContratoActualizado;
import ec.com.proeventos.domain.ventas.event.ReporteVendedorActualizado;
import ec.com.proeventos.domain.ventas.event.ReporteVendedorAgregado;
import ec.com.proeventos.domain.ventas.event.ReporteVendedorEliminado;
import ec.com.proeventos.domain.ventas.event.AdicionalContratoActualizado;
import ec.com.proeventos.domain.ventas.event.AdicionalContratoAgregado;
import ec.com.proeventos.domain.ventas.event.AdicionalContratoEliminado;
import ec.com.proeventos.domain.ventas.event.ClienteCreado;
import ec.com.proeventos.domain.ventas.event.ContratoActualizado;
import ec.com.proeventos.domain.ventas.event.ContratoCreado;
import ec.com.proeventos.domain.ventas.event.DireccionClienteActualizado;
import ec.com.proeventos.domain.ventas.event.EstadoContratoActualizado;
import ec.com.proeventos.domain.ventas.event.DatosVendedorActualizado;
import ec.com.proeventos.domain.ventas.event.VendedorCreado;
import ec.com.proeventos.domain.ventas.event.VentaCreada;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.ClienteId;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.Estado;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.Informacion;
import ec.com.proeventos.domain.ventas.valor.Pago;
import ec.com.proeventos.domain.ventas.valor.Reporte;
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

    public void actualizarReporteVendedor(VendedorId vendedorId, Reporte r){
        appendChange(new ReporteVendedorActualizado(vendedorId,r)).apply();
    }   

    public void actualizarPagoContrato(ContratoId contratoId, Pago pago){
        appendChange(new PagoContratoActualizado(contratoId,pago)).apply();
    }

    public void actualizarEstadoContrato(ContratoId contratoId, Estado estado){
        appendChange(new EstadoContratoActualizado(contratoId, estado)).apply();
    }

    public void actualizarAdicionalContrato(ContratoId contratoId, Adicional add){
        appendChange(new AdicionalContratoActualizado(contratoId,add)).apply();
    }

    //---------------Eventos: Agregar
    public void agregarReporteVendedor(VendedorId vendedorId, Dato datos, Reporte r){
        appendChange(new ReporteVendedorAgregado(vendedorId,datos,r)).apply();
    }

    public void agregarAdicionalContrato(ContratoId contratoId, Adicional add){
        appendChange(new AdicionalContratoAgregado(contratoId,add)).apply();
    }

    //--------------Eventos: Eliminar
    public void eliminarReporteVendedor(Reporte r){
        appendChange(new ReporteVendedorEliminado(r)).apply();
    
    }

    //No tiene sentido eliminar un pago en contexto de la empresa
    /*public void eliminarPagoContrato(ContratoId contratoId){
        
    }*/

    public void eliminarAdicionalContrato(Adicional add){
        appendChange(new AdicionalContratoEliminado(add)).apply();
    }
    

}
