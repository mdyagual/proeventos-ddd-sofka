package ec.com.proeventos.domain.ventas;

import co.com.sofka.domain.generic.EventChange;
import ec.com.proeventos.domain.ventas.event.VentaCreada;
import ec.com.proeventos.domain.ventas.event.VendedorCreado;
import ec.com.proeventos.domain.ventas.event.ClienteCreado;
import ec.com.proeventos.domain.ventas.event.InformacionClienteActualizado;
import ec.com.proeventos.domain.ventas.event.DireccionClienteActualizado;
import ec.com.proeventos.domain.ventas.event.DatosVendedorActualizado;
import ec.com.proeventos.domain.ventas.event.ContratoCreado;
import ec.com.proeventos.domain.ventas.event.ContratoActualizado;
import ec.com.proeventos.domain.ventas.event.ReporteVendedorActualizado;
import ec.com.proeventos.domain.ventas.event.PagoContratoActualizado;
import ec.com.proeventos.domain.ventas.event.EstadoContratoActualizado;
import ec.com.proeventos.domain.ventas.event.AdicionalContratoActualizado;
import ec.com.proeventos.domain.ventas.event.ReporteVendedorAgregado;
import ec.com.proeventos.domain.ventas.event.AdicionalContratoAgregado;
import ec.com.proeventos.domain.ventas.event.ReporteVendedorEliminado;
import ec.com.proeventos.domain.ventas.event.AdicionalContratoEliminado;


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

        //Contrato creado
        apply((ContratoCreado event) -> {
            venta.contrato= new Contrato(event.getContratoId(),event.getTotal());
            
        });

        /* Actualizacion */
        apply((ContratoActualizado event) -> {
            venta.contrato= new Contrato(event.getContratoId(),event.getTotal());
            
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

        apply((ReporteVendedorActualizado event) -> {
            venta.vendedor.actualizarReporte(event.getReporte());
            
        });

        apply((PagoContratoActualizado event) -> {
            venta.contrato.actualizarPago(event.getPago());
            
        });

        apply((EstadoContratoActualizado event) -> {
            venta.contrato.actualizarEstado(event.getEstado());
            
        });

        apply((AdicionalContratoActualizado event) -> {
            venta.contrato.actualizarAdicional(event.getAdicional());
            
        });

        /* Agregar */
        apply((ReporteVendedorAgregado event) -> {
            venta.vendedor.agregarReporte(event.getReporte());
            
        });

        apply((AdicionalContratoAgregado event) -> {
            venta.contrato.agregarAdicional(event.getAdicional());
            
        });

        /* Eliminar */
        apply((ReporteVendedorEliminado event) -> {
            venta.vendedor.eliminarReporte(event.getReporte());
            
        });

        apply((AdicionalContratoEliminado event) -> {
            venta.contrato.eliminarAdicional(event.getAdicional());
            
        });




    }
}
