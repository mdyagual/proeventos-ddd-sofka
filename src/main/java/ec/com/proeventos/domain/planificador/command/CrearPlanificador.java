package ec.com.proeventos.domain.planificador.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.planificador.Informacion;
import ec.com.proeventos.domain.planificador.Itinerario;
import ec.com.proeventos.domain.planificador.Registro;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class CrearPlanificador extends Command {
    private final PlanificadorId planificadorId;
    private final Informacion informacion;
    private final Registro registro;
    private final Itinerario itinerario;
    private final VentaId ventaId;

    public CrearPlanificador(PlanificadorId planificadorId, Informacion informacion, Registro registro,
            Itinerario itinerario, VentaId ventaId) {
        this.planificadorId = planificadorId;
        this.informacion = informacion;
        this.registro = registro;
        this.itinerario = itinerario;
        this.ventaId = ventaId;
    }

    public PlanificadorId getPlanificadorId() {
        return planificadorId;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public Registro getRegistro() {
        return registro;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public VentaId getVentaId() {
        return ventaId;
    }



    
}
