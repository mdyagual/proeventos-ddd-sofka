package ec.com.proeventos.domain.evento.valor;

import co.com.sofka.domain.generic.Identity;

public class EventoId extends Identity{
    private EventoId(String valor){
        super(valor);
    }

    public EventoId(){}

    public static EventoId of (String valor){
        return new EventoId(valor);
    }

}
