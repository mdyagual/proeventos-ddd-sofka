package ec.com.proeventos.domain.evento;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.evento.valor.AnimadorId;
import ec.com.proeventos.domain.evento.valor.Detalle;

public class Animador extends Entity<AnimadorId>{
    private Detalle detalle;

    public Animador(AnimadorId animadorId, Detalle detalle){
        super(animadorId);
        this.detalle = detalle;
    }

    public Detalle detalle(){
        return detalle;
    }

    public void actualizarDetalle(Detalle d){
        this.detalle = d;
    }
}
