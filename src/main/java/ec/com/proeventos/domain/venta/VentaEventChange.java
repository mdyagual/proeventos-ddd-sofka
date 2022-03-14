package ec.com.proeventos.domain.venta;

import co.com.sofka.domain.generic.EventChange;
import ec.com.proeventos.domain.venta.event.ClienteCreado;
import ec.com.proeventos.domain.venta.event.DatosVendedorActualizado;
import ec.com.proeventos.domain.venta.event.DireccionClienteActualizado;
import ec.com.proeventos.domain.venta.event.EstadoContratoActualizado;
import ec.com.proeventos.domain.venta.event.InformacionClienteActualizado;
import ec.com.proeventos.domain.venta.event.PagoContratoActualizado;
import ec.com.proeventos.domain.venta.event.VendedorCreado;
import ec.com.proeventos.domain.venta.event.VentaCreada;



public class VentaEventChange extends EventChange {
    
    public VentaEventChange(Venta venta){
        /* Creacion */
        //Venta creada
        apply((VentaCreada event) -> {
            venta.vendedor = event.getVendedor();
            venta.cliente = event.getCliente();
            venta.contrato = event.getContrato();
            
        });

        //Vendedor creado
        apply((VendedorCreado event) -> {
            venta.vendedor= new Vendedor(event.getVendedorId(),event.getDatos());
            
        });
        
        //Cliente creado
        apply((ClienteCreado event) -> {
            venta.cliente= new Cliente(event.getClienteId(),event.getInformacion());
            
        });

       
        apply((InformacionClienteActualizado event) -> {
            venta.cliente= new Cliente(event.getClienteId(),event.getInformacion());
            
        });

       
        apply((DireccionClienteActualizado event) -> {
            venta.cliente.actualizarDireccionInformación(event.getInformacion());
            
        });

        apply((DatosVendedorActualizado event) -> {
            venta.vendedor.actualizarDatos(event.getDatos());
            
        });       

        apply((PagoContratoActualizado event) -> {
            venta.contrato.actualizarPago(event.getPago());
            
        });

        apply((EstadoContratoActualizado event) -> {
            venta.contrato.actualizarEstado(event.getEstado());
            
        });


    }
}
