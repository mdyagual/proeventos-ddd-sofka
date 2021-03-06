package ec.com.proeventos.domain.evento.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.evento.valor.EventoId;
import ec.com.proeventos.domain.evento.valor.SaloneroId;
import ec.com.proeventos.domain.evento.valor.Turno;

public class CrearSalonero extends Command{    
    private final EventoId eventoId;
    private final SaloneroId saloneroId;
    private final String nombre;
    private final String apellido;
    private final Turno turno;

    public CrearSalonero(EventoId eventoId,SaloneroId saloneroId, String nombre, String apellido, Turno turno) {
        this.eventoId = eventoId;
        this.saloneroId = saloneroId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }

    public SaloneroId getSaloneroId() {
        return saloneroId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Turno getTurno() {
        return turno;
    }

    public EventoId getEventoId() {
        return eventoId;
    }

    

    
    
}
