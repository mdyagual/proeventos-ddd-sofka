package ec.com.proeventos.domain.ventas;

import co.com.sofka.domain.generic.EventChange;
import ec.com.proeventos.domain.ventas.event.VentaCreada;
import ec.com.proeventos.domain.ventas.event.VendedorCreado;
import ec.com.proeventos.domain.ventas.event.ClienteCreado;
import ec.com.proeventos.domain.ventas.event.InformacionClienteActualizado;
import ec.com.proeventos.domain.ventas.event.ContratoCreado;

public class VentaEventChange extends EventChange {
    
    public VentaEventChange(Venta venta){
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

        //Cliente actualizado
        apply((InformacionClienteActualizado event) -> {
            venta.cliente= new Cliente(event.getClienteId(),event.getInformacion());
            
        });

    }
}
