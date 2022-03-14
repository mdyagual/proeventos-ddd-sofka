package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.ContratoId;
import ec.com.proeventos.domain.ventas.valor.Pago;

public class ActualizarPagoContrato extends Command{
    private final ContratoId contratoId;
    private final Pago pago;

    

    public ActualizarPagoContrato(ContratoId contratoId, Pago pago) {
        this.contratoId = contratoId;
        this.pago = pago;
    }

    public ContratoId getContratoId() {
        return contratoId;
    }

    public Pago getPago() {
        return pago;
    }
    
}
