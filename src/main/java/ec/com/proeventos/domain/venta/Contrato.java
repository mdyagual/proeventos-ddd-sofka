package ec.com.proeventos.domain.venta;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Estado;
import ec.com.proeventos.domain.venta.valor.Fecha;
import ec.com.proeventos.domain.venta.valor.Pago;

public class Contrato extends Entity<ContratoId>{
    private Double total;
    private Pago pago;
    private Fecha fecha;
    private Estado estado;

    public Contrato (ContratoId contratoId, Double total, Pago pago){
        super(contratoId);
        this.total = total;
        this.fecha = new Fecha();
        this.estado = new Estado(Estado.Fase.PENDIENTE);
        this.pago = pago;
    }

    public Double total(){
        return total;
    }

    public Fecha fecha(){
        return fecha;
    }

    public Estado estado(){
        return estado;
    }

    public Pago pago(){
        return pago;
    }

 
    //actualizar pago
    public void actualizarPago(Pago p){
        this.pago = p;
    }
    //actualizar estado
    public void actualizarEstado(Estado e){
        this.estado = e;

    }
    



}
