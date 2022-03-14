package ec.com.proeventos.domain.ventas.valor;

import co.com.sofka.domain.generic.Identity;

public class ContratoId extends Identity {
    private ContratoId(String valor){
        super(valor);

    }

    public ContratoId(){}

    public static ContratoId of (String valor){
        return new ContratoId(valor);
    }
}
