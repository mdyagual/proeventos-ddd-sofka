package ec.com.proeventos.domain.planificador.valor;

import co.com.sofka.domain.generic.Identity;

public class ItinerarioId extends Identity {
    private ItinerarioId(String valor){
        super(valor);
    }

    public ItinerarioId(){}

    public static ItinerarioId of (String valor){
        return new ItinerarioId(valor);
    }
    
}
