package ec.com.proeventos.domain.planificador.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Disenio implements ValueObject<Disenio.Props>{
    private final String nomDisenio;
    private final Integer numInvitados;
    private final Double presupuesto;

    public Disenio(String nomDisenio, Integer numInvitados, Double presupuesto){
        this.nomDisenio = Objects.requireNonNull(nomDisenio);
        this.numInvitados = Objects.requireNonNull(numInvitados);
        this.presupuesto = Objects.requireNonNull(presupuesto);
    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public String nomDisenio(){
                return nomDisenio;
            }

            @Override
            public Integer numInvitados(){
                return numInvitados;
            }

            @Override
            public Double presupuesto(){
                return presupuesto;
            }
        };
    }

    public interface Props{
        String  nomDisenio();
        Integer numInvitados();
        Double presupuesto();
        
    }
}
