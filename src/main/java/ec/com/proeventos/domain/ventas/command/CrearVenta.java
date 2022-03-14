package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.Cliente;
import ec.com.proeventos.domain.ventas.Contrato;
import ec.com.proeventos.domain.ventas.Vendedor;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.VentaId;

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
