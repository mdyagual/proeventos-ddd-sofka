package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.valor.InformacionId;
import ec.com.proeventos.domain.planificador.valor.Usuario;

public class InformacionCreada extends DomainEvent {
    private final InformacionId informacionId;
    private final Usuario usuario;

    public InformacionCreada(InformacionId informacionId, Usuario usuario){
        super("planificador.informacioncreada");
        this.informacionId = informacionId;
        this.usuario = usuario;
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public InformacionId getInformacionId() {
        return informacionId;
    }

    

    
}
