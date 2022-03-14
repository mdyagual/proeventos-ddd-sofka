package ec.com.proeventos.domain.evento.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Turno implements ValueObject<Turno.Props>{
    private final String valor;

    public Turno (String valor){
        this.valor = Objects.requireNonNull(valor);
        

    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public String valor(){
                return valor;
            }

        };
    }

    public interface Props{
        String  valor();
        
    }
}
