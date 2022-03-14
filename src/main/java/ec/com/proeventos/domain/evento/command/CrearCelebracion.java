package ec.com.proeventos.domain.evento.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.evento.valor.CelebracionId;
import ec.com.proeventos.domain.evento.valor.Duracion;
import ec.com.proeventos.domain.evento.valor.Lugar;

public class CrearCelebracion extends Command {
    private final CelebracionId celebracionId;
    private final Lugar lugar;
    private final Duracion duracion;

    public CrearCelebracion(CelebracionId celebracionId, Lugar lugar, Duracion duracion) {
        this.celebracionId = celebracionId;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    public CelebracionId getCelebracionId() {
        return celebracionId;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    

    

}
