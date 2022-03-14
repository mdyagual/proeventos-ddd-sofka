package ec.com.proeventos.domain.eventos;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.eventos.valor.CelebracionId;
import ec.com.proeventos.domain.eventos.valor.Duracion;
import ec.com.proeventos.domain.eventos.valor.Lugar;

public class Celebracion extends Entity<CelebracionId>{
    private Lugar lugar;
    private Duracion duracion;

    public Celebracion(CelebracionId entityId, Lugar lugar, Duracion duracion) {
        super(entityId);
        this.lugar = lugar;
        this.duracion = duracion;
    }

    public Lugar lugar(){
        return lugar;
    }

    public Duracion duracion(){
        return duracion;
    }
    
    
}
