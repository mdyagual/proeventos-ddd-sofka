package ec.com.proeventos.domain.ventas.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.ventas.valor.Adicional;

public class AdicionalContratoEliminado extends DomainEvent {
    private final Adicional adicional;

    public AdicionalContratoEliminado(Adicional adicional){
        super("venta.adicionalcontratoeliminado");
        this.adicional= adicional;

    }

    public Adicional getAdicional() {
        return adicional;
    }

    
}
