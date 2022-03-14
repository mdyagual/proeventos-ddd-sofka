package ec.com.proeventos.domain.venta.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.venta.Cliente;
import ec.com.proeventos.domain.venta.Contrato;
import ec.com.proeventos.domain.venta.Vendedor;
import ec.com.proeventos.domain.venta.valor.Fecha;
import ec.com.proeventos.domain.venta.valor.VentaId;

public class CrearVenta extends Command{
    private final VentaId ventaId;
    private final Cliente cliente;
    private final Vendedor vendedor;
    private final Contrato contrato;
    private final Fecha fecha;
    
    public CrearVenta(VentaId ventaId, Cliente cliente, Vendedor vendedor, Contrato contrato) {
        this.ventaId = ventaId;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.contrato = contrato;
        this.fecha = new Fecha();
    }


    public VentaId getVentaId() {
        return ventaId;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Fecha getFecha() {
        return fecha;
    }

    

    


}
