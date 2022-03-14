package ec.com.proeventos.domain.planificador;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.planificador.valor.Disenio;
import ec.com.proeventos.domain.planificador.valor.ItinerarioId;

public class Itinerario extends Entity<ItinerarioId> {
    private Disenio disenio;

    public Itinerario(ItinerarioId itinerarioId, Disenio disenio){
        super(itinerarioId);
        this.disenio = disenio;
    }

    public Disenio disenio(){
        return disenio;

    }

    public void actualizarDisenio(Disenio disenioNuevo){
        this.disenio = disenioNuevo;
    }
}
