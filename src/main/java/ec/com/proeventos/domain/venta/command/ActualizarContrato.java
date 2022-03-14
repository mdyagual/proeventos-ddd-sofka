package ec.com.proeventos.domain.venta.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.venta.valor.ContratoId;

public class ActualizarContrato extends Command {
    private final ContratoId contratoId;
    private final Double total;

    public ActualizarContrato(ContratoId contratoId, Double total) {
        this.contratoId = contratoId;
        this.total = total;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Double getTotal() {
        return total;
    }

    

    

    
}
