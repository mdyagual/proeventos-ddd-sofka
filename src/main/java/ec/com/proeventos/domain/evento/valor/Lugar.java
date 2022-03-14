package ec.com.proeventos.domain.evento.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Lugar implements ValueObject<Lugar.Props> {
    
    private final String nombre;
    private final String direccion;
    private final Integer capacidad;

    public Lugar (String nombre, String direccion, Integer capacidad){
        this.nombre = Objects.requireNonNull(nombre);
        this.direccion= Objects.requireNonNull(direccion);        
        this.capacidad = Objects.requireNonNull(capacidad);

    }

    @Override
    public Props value(){
        return new Props(){
            
            @Override
            public String nombre(){
                return nombre;
            }
            
            @Override
            public String direccion(){
                return direccion;
            }

            @Override
            public Integer capacidad(){
                return capacidad;
            }

        };
    }

    public interface Props{
        String  nombre();
        String  direccion();
        Integer capacidad();
        
    }
}
