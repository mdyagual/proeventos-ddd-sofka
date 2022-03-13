package ec.com.proeventos.domain.ventas;

import co.com.sofka.domain.generic.EventChange;
import ec.com.proeventos.domain.ventas.event.VentaCreada;

public class VentaEventChange extends EventChange {
    
    public VentaEventChange(Venta venta){
        //Venta creada
        apply((VentaCreada event) -> {
            venta.vendedor = event.getVendedor();
            venta.cliente = event.getCliente();
            venta.contrato = event.getContrato();
            
        });
    }
}
