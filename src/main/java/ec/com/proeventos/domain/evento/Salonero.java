package ec.com.proeventos.domain.evento;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.evento.valor.SaloneroId;
import ec.com.proeventos.domain.evento.valor.Turno;

public class Salonero extends Entity<SaloneroId>{
    private String nombre;
    private String apellido;
    private Turno turno;

    public Salonero(SaloneroId entityId, String nombre, String apellido, Turno turno) {
        super(entityId);
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }

    public String nombre(){
        return nombre;
    }

    public String apellido(){
        return apellido;
    }

    public Turno turno(){
        return turno;
    }

    public void actualizarTurno(Turno t){
        this.turno = t;
    }



    

    
}
