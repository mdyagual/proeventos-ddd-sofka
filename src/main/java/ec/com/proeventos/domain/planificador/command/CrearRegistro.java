package ec.com.proeventos.domain.planificador.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.planificador.valor.Descripcion;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;
import ec.com.proeventos.domain.planificador.valor.RegistroId;

public class CrearRegistro extends Command{
    private final PlanificadorId planificadorId;
    private final RegistroId registroId;
    private final Descripcion descripcion;

    public CrearRegistro(PlanificadorId planificadorId, RegistroId registroId, Descripcion descripcion) {
        this.planificadorId = planificadorId;
        this.registroId = registroId;
        this.descripcion = descripcion;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public PlanificadorId getPlanificadorId() {
        return planificadorId;
    }

    
    


}
