package ec.com.proeventos.domain.eventos.valor;

import co.com.sofka.domain.generic.Identity;

public class CelebracionId extends Identity {
    private CelebracionId(String valor){
        super(valor);
    }

    public CelebracionId(){}

    public static CelebracionId of (String valor){
        return new CelebracionId(valor);
    }
}
