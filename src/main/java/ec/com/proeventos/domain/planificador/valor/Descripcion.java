package ec.com.proeventos.domain.planificador.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<Descripcion.Props>{
    private final String nomEvento;
    private final Fecha fecha;
    
    public Descripcion(String nomEvento, Fecha fecha) {
        this.nomEvento = Objects.requireNonNull(nomEvento);
        this.fecha = Objects.requireNonNull(fecha);
    }

    @Override
    public Props value (){
        return new Props(){
            @Override
            public String nomEvento() {
                return nomEvento;
            }

            @Override
            public Fecha fecha() {
                return fecha;
            }

            
        };
    }

    public interface Props{
        String  nomEvento();
        Fecha  fecha();
        
    }
    

}
