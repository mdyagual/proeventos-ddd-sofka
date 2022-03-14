package ec.com.proeventos.domain.venta.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Estado;
import ec.com.proeventos.domain.venta.valor.Fecha;
import ec.com.proeventos.domain.venta.valor.Pago;
import ec.com.proeventos.domain.venta.valor.VentaId;

public class CrearContrato extends Command {
    private final VentaId ventaId;
    private final ContratoId contratoId;
    private final Double total;
    private final Pago pago;
    private final Fecha fechaContrato;
    private final Estado estado;

    public CrearContrato(VentaId ventaId,ContratoId contratoId,Double total, Pago pago) {
        this.ventaId = ventaId;
        this.contratoId = contratoId;
        this.total = total;
        this.pago = pago;
        this.estado = new Estado(Estado.Fase.PENDIENTE);
        this.fechaContrato = new Fecha();
    }

    public Double getTotal() {
        return total;
    }

    public Pago getPago() {
        return pago;
    }

    public Fecha getFechaContrato() {
        return fechaContrato;
    }

    public Estado getEstado() {
        return estado;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    
    

    
}
