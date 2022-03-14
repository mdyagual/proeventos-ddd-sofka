package ec.com.proeventos.domain.evento;

import java.util.ArrayList;

import co.com.sofka.domain.generic.EventChange;
import ec.com.proeventos.domain.evento.event.AnimadorCreado;
import ec.com.proeventos.domain.evento.event.CelebracionCreada;
import ec.com.proeventos.domain.evento.event.EventoCreado;
import ec.com.proeventos.domain.evento.event.SaloneroCreado;

public class EventoEventChange extends EventChange{
    public EventoEventChange (Evento evento){
        apply((EventoCreado event) -> {
            evento.planificadorId = event.getPlanficadorId();
            evento.celebracion = event.getCelebracion();
            evento.animador = event.getAnimador();
            evento.saloneros = new ArrayList<>();
           
        });

        apply((CelebracionCreada event) -> {
            evento.celebracion = new Celebracion(event.getCelebracionId(),event.getLugar(),event.getDuracion());
              
        });
  
        apply((AnimadorCreado event) -> {
             evento.animador = new Animador(event.getAnimadorId(),event.getDetalle());
               
        });
  
        apply((SaloneroCreado event) -> {
              evento.saloneros.add(new Salonero(event.getSaloneroId(), event.getNombre(), event.getApellido(), event.getTurno()));
                
        });
    }
    
}
