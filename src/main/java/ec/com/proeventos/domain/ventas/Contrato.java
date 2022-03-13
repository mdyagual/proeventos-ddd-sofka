package ec.com.proeventos.domain.ventas;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Estado;
import ec.com.proeventos.domain.ventas.valor.Fecha;
import ec.com.proeventos.domain.ventas.valor.Pago;

public class Contrato extends Entity<ContratoId>{
    private Double total;
    private List<Pago> pagos;
    private Fecha fecha;
    private Estado estado;
    private List<Adicional> adicionales;

    public Contrato (ContratoId contratoId, Double total){
        super(contratoId);
        this.total = total;
        this.fecha = new Fecha();
        this.estado = new Estado(Estado.Fase.PENDIENTE);
        this.pagos = new ArrayList<>();
        this.adicionales = new ArrayList<>();
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

    public List<Pago> pagos(){
        return pagos;
    }

    public List<Adicional> Adicionales(){
        return adicionales;
    }

    //actualizar pago
    public void actualizarPago(){

    }
    //actualizar estado
    public void actualizarEstado(){

    }
    //agregar adicional
    public void agregarAdicional(){

    }
    //actualizar adicional
    public void actualizarAdicional(){

    }
    //eliminar  adicional
    public void eliminarAdicional(){
        
    }



}
