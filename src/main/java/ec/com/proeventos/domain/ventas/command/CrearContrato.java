package ec.com.proeventos.domain.ventas.command;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.Estado;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.Pago;

public class CrearContrato extends Command {
    private final Double total;
    private final Pago pago;
    private final Fecha fechaContrato;
    private final Estado estado;
    private final List<Adicional> adicionales;
    
    public CrearContrato(Double total, Pago pago) {
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

    

    
}
