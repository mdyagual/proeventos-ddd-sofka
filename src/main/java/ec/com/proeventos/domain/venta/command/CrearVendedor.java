package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.VendedorId;
import ec.com.proeventos.domain.ventas.valor.VentaId;

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
