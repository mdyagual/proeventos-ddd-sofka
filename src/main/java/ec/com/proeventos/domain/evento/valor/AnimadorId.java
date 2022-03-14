package ec.com.proeventos.domain.eventos.valor;

import co.com.sofka.domain.generic.Identity;

public class AnimadorId extends Identity {
    private AnimadorId(String valor){
        super(valor);
    }

    public AnimadorId(){}

    public static AnimadorId of (String valor){
        return new AnimadorId(valor);
    }
}
