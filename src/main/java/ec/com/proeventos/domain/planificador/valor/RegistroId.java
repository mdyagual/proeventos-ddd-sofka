package ec.com.proeventos.domain.planificador.valor;

import co.com.sofka.domain.generic.Identity;

public class RegistroId extends Identity {
    private RegistroId(String valor){
        super(valor);
    }

    public RegistroId(){}

    public static RegistroId of (String valor){
        return new RegistroId(valor);
    }
    
}
