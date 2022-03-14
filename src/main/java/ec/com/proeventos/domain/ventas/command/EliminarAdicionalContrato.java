package ec.com.proeventos.domain.ventas.command;

import ec.com.proeventos.domain.ventas.utils.Adicional;

public class EliminarAdicionalContrato {
    private final Adicional adicional;

    public EliminarAdicionalContrato(Adicional adicional){
        
        this.adicional= adicional;

    }

    public Adicional getAdicional() {
        return adicional;
    }

}

