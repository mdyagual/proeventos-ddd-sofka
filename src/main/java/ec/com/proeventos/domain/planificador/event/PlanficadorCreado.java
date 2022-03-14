package ec.com.proeventos.domain.planificador.event;

import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.Informacion;
import ec.com.proeventos.domain.planificador.Itinerario;
import ec.com.proeventos.domain.planificador.Registro;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class PlanficadorCreado extends DomainEvent {
    private final Informacion informacion;
    private final Registro registro;
    private final Itinerario itinerario;
    private final VentaId ventaId;

    public PlanficadorCreado(Informacion informacion, Registro registro, Itinerario itinerario,VentaId ventaId) {
        super("planificador.planificadorcreado");
        this.informacion = informacion;
        this.registro = registro;
        this.itinerario = itinerario;
        this.ventaId = ventaId;
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
