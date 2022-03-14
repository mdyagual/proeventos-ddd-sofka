package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Estado;

public class ActualizarEstadoContrato extends Command{
    private final ContratoId contratoId;
    private final Estado estado;
    
    public ActualizarEstadoContrato(ContratoId contratoId, Estado estado) {
        this.contratoId = contratoId;
        this.estado = estado;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Estado getEstado() {
        return estado;
    }

    

    
}
