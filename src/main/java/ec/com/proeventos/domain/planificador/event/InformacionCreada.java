package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.valor.Usuario;

public class InformacionCreada extends DomainEvent {
    private final Usuario usuario;

    public InformacionCreada(Usuario usuario){
        super("planificador.informacioncreada");
        this.usuario = usuario;
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    
}
