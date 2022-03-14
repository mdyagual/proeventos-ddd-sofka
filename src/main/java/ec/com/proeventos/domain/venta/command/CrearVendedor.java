package ec.com.proeventos.domain.venta.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.VendedorId;
import ec.com.proeventos.domain.venta.valor.VentaId;

public class CrearVendedor extends Command{
    private final VentaId ventaId;
    private final VendedorId vendedorId;
    private final Dato datos;
    
    public CrearVendedor(VentaId ventaId,VendedorId vendedorId, Dato datos) {
        this.ventaId = ventaId;
        this.vendedorId = vendedorId;
        this.datos = datos;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Dato getDatos() {
        return datos;
    }

    

    public VentaId getVentaId() {
        return ventaId;
    }

    

    

    
}
