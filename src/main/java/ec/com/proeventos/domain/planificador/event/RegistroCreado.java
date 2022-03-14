package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.valor.Descripcion;
import ec.com.proeventos.domain.planificador.valor.RegistroId;

public class RegistroCreado extends DomainEvent {
    private final RegistroId registroId;
    private final Descripcion descripcion;

    public RegistroCreado(RegistroId registroId, Descripcion descripcion) {
        super("planificador.registrocreado");
        this.registroId = registroId;
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    
    

    
}
