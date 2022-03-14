package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Adicional;
import ec.com.proeventos.domain.ventas.valor.ContratoId;

public class ActualizarAdicionalContrato extends Command {
    private final ContratoId contratoId;
    private final Adicional adicional;
    
    public ActualizarAdicionalContrato(ContratoId contratoId, Adicional adicional) {
        this.contratoId = contratoId;
        this.adicional = adicional;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Adicional getAdicional() {
        return adicional;
    }

    

    


    
}
