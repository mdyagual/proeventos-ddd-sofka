package ec.com.proeventos.domain.eventos.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Detalle implements ValueObject<Detalle.Props> {
    
    private final String nombre;
    private final String apellido;
    private final String genero;

    public Detalle (String nombre, String apellido, String genero) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.genero = Objects.requireNonNull(genero);

    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public String nombre(){
                return nombre;
            }
            
            @Override
            public String apellido(){
                return apellido;
            }

            @Override
            public String genero(){
                return genero;
            }
        };
    }

    public interface Props{
        
        String  nombre();
        String  apellido();
        String  genero();
        
    }
}
