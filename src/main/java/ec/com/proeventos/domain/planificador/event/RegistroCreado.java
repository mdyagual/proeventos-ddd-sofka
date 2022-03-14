package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.valor.Descripcion;

public class RegistroCreado extends DomainEvent {
    private final Descripcion descripcion;

    public RegistroCreado(Descripcion descripcion) {
        super("planificador.registrocreado");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    

    
}
