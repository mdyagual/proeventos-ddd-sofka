package ec.com.proeventos.domain.evento.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.evento.valor.SaloneroId;
import ec.com.proeventos.domain.evento.valor.Turno;

public class SaloneroCreado extends DomainEvent {
    private final SaloneroId saloneroId;
    private final String nombre;
    private final String apellido;
    private final Turno turno;
    
    public SaloneroCreado(SaloneroId saloneroId, String nombre, String apellido, Turno turno) {
        super("evento.salonerocreado");
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

    

    

}
