package ec.com.proeventos.domain.planificador;

import co.com.sofka.domain.generic.EventChange;
import ec.com.proeventos.domain.planificador.event.InformacionCreada;
import ec.com.proeventos.domain.planificador.event.ItinerarioCreado;
import ec.com.proeventos.domain.planificador.event.PlanficadorCreado;
import ec.com.proeventos.domain.planificador.event.RegistroCreado;

public class PlanificadorEventChange extends EventChange {
    public PlanificadorEventChange(Planificador planificador){
        /*Creacion*/
        apply((PlanficadorCreado event) -> {
            planificador.informacion = event.getInformacion();
            planificador.registro = event.getRegistro();
            planificador.itinerario = event.getItinerario();
            planificador.ventaId = event.getVentaId();
           
        });

        apply((InformacionCreada event) -> {
          planificador.informacion= new Informacion(event.getInformacionId(), event.getUsuario());
            
        });

        apply((RegistroCreado event) -> {
           planificador.registro= new Registro(event.getRegistroId(), event.getDescripcion());
             
        });

        apply((ItinerarioCreado event) -> {
            planificador.itinerario= new Itinerario(event.getItinerarioId(), event.getDisenio());
              
          });


    }

   
}
