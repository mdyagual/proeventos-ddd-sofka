package ec.com.proeventos.domain.evento.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Duracion implements ValueObject<Duracion.Props> {
    private final String horaInicio;
    private final String horaFin;

    public Duracion (String horaInicio, String horaFin){
        this.horaInicio = Objects.requireNonNull(horaInicio);
        this.horaFin = Objects.requireNonNull(horaFin);

    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public String horaInicio(){
                return horaInicio;
            }
            
            @Override
            public String horaFin(){
                return horaFin;
            }
        };
    }

    public interface Props{
        String  horaInicio();
        String  horaFin();
        
    }
}
