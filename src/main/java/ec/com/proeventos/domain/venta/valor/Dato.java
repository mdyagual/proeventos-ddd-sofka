package ec.com.proeventos.domain.venta.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Dato implements ValueObject<Dato.Props>{
    private final String nombre;
    private final String apellido;
    private final String sucursal;
    
    public Dato(String nombre, String apellido, String sucursal) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.sucursal = Objects.requireNonNull(sucursal);
    }

    @Override
    public Props value (){
        return new Props (){
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }

            @Override
            public String sucursal() {
                return sucursal;
            }
        };
    }

    public interface Props{
        String nombre();
        String apellido();
        String sucursal();
        
    }
    

}
