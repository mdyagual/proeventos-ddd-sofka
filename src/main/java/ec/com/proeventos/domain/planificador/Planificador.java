package ec.com.proeventos.domain.planificador;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.planificador.event.InformacionCreada;
import ec.com.proeventos.domain.planificador.event.ItinerarioCreado;
import ec.com.proeventos.domain.planificador.event.PlanficadorCreado;
import ec.com.proeventos.domain.planificador.event.RegistroCreado;
import ec.com.proeventos.domain.planificador.valor.Descripcion;
import ec.com.proeventos.domain.planificador.valor.Disenio;
import ec.com.proeventos.domain.planificador.valor.PlanificadorId;
import ec.com.proeventos.domain.planificador.valor.Usuario;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class Planificador extends AggregateEvent<PlanificadorId> {
    protected Informacion informacion;
    protected Registro registro;
    protected Itinerario itinerario;
    protected VentaId ventaId;

    public Planificador (PlanificadorId planificadorId,  Informacion informacion, Registro registro, Itinerario itinerario,VentaId ventaId){
        super(planificadorId);
        appendChange(new PlanficadorCreado(informacion, registro, itinerario, ventaId));
        //subscribe(new PlanificadorEventChange(this));
    }

    /*private Planificador(PlanificadorId planificadorId){
        super(planificadorId);
        //subscribe(new PlanificadorEventChange(this));
    }

    public static Planificador from (PlanificadorId planificadorId, List<DomainEvent>events){
        var planficador = new Planficador(planificadorId);
        events.forEach(planficador::applyEvent);
        return planficador;
    }*/

    //---------------Eventos: Crear
    public void crearInformacion(Usuario usuario){
        appendChange(new InformacionCreada(usuario)).apply();

    }

    public void crearRegistro(Descripcion descripcion){
        appendChange(new RegistroCreado(descripcion)).apply();
    }

    public void crearitinerario(Disenio disenio){
        appendChange(new ItinerarioCreado(disenio)).apply();

    }
    



    
}
