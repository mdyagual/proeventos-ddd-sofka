package ec.com.proeventos.domain.planificador.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Usuario implements ValueObject<Usuario.Props> {
    private final String correo;
    private final String nombre;
    private final String apellido;

    public Usuario (String correo, String nombre, String apellido){
        this.correo = Objects.requireNonNull(correo);
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);

    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public String correo(){
                return correo;
            }

            @Override
            public String nombre(){
                return nombre;
            }
            
            @Override
            public String apellido(){
                return apellido;
            }
        };
    }

    public interface Props{
        String  correo();
        String  nombre();
        String  apellido();
        
    }
}
