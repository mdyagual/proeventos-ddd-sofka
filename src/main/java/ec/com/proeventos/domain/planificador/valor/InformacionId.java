package ec.com.proeventos.domain.planificador.valor;

import co.com.sofka.domain.generic.Identity;

public class InformacionId extends Identity{
    private InformacionId(String valor){
        super(valor);
    }

    public InformacionId(){}

    public static InformacionId of (String valor){
        return new InformacionId(valor);
    }
    
}
