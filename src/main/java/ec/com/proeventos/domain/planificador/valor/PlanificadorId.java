package ec.com.proeventos.domain.planificador.valor;

import co.com.sofka.domain.generic.Identity;

public class PlanificadorId extends Identity{
    private PlanificadorId(String valor){
        super(valor);
    }

    public PlanificadorId(){

    }

    public static PlanificadorId of (String valor){
        return new PlanificadorId(valor);
    }
}
