package ec.com.proeventos.domain.ventas.command;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Estado;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.Pago;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class CrearContrato extends Command {
    private final VentaId ventaId;
    private final ContratoId contratoId;
    private final Double total;
    private final Pago pago;
    private final Fecha fechaContrato;
    private final Estado estado;
    private final List<Adicional> adicionales;
    
    public CrearContrato(VentaId ventaId,ContratoId contratoId,Double total, Pago pago) {
        this.ventaId = ventaId;
        this.contratoId = contratoId;
        this.total = total;
        this.pago = pago;
        this.estado = new Estado(Estado.Fase.PENDIENTE);
        this.fechaContrato = new Fecha();
        this.adicionales = new ArrayList<>();
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

    public List<Adicional> getAdicionales() {
        return adicionales;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    
    

    
}
