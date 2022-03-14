package ec.com.proeventos.domain.eventos.valor;

import co.com.sofka.domain.generic.Identity;

public class SaloneroId extends Identity {
    private SaloneroId(String valor){
        super(valor);
    }

    public SaloneroId(){}

    public static SaloneroId of (String valor){
        return new SaloneroId(valor);
    }
}
