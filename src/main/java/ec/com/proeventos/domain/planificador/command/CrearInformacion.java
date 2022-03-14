package ec.com.proeventos.domain.planificador.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.planificador.valor.InformacionId;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;
import ec.com.proeventos.domain.planificador.valor.Usuario;

public class CrearInformacion extends Command{
    private final PlanificadorId planificadorId;
    private final InformacionId informacionId;
    private final Usuario usuario;

    public CrearInformacion(PlanificadorId planificadorId, InformacionId informacionId, Usuario usuario) {
        this.planificadorId= planificadorId;
        this.informacionId = informacionId;
        this.usuario = usuario;
    }

    public InformacionId getInformacionId() {
        return informacionId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public PlanificadorId getPlanificadorId() {
        return planificadorId;
    }

    

    

    

    
}
