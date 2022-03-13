package ec.com.proeventos.domain.ventas.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Adicional implements ValueObject<Adicional.Props> {
    private final String tipoAdicional;
    private final Double precio;
    private final Integer cantidad;
    private final Double total;

    public Adicional (String tipoAdicional, Double precio, Integer cantidad){
        this.tipoAdicional = Objects.requireNonNull(tipoAdicional);
        this.precio = Objects.requireNonNull(precio);
        this.cantidad = Objects.requireNonNull(cantidad);
        this.total = precio * cantidad;
        
    }

    @Override
    public Props value (){
        return new Props (){
            @Override
            public String tipoAdicional() {
                return tipoAdicional;
            }

            @Override
            public Integer cantidad() {
                return cantidad;
            }

            @Override
            public Double precio() {
                return precio;
            }

            @Override
            public Double total() {
                return total;
            }

            
        };
    }

    public interface Props{
        String tipoAdicional();
        Integer cantidad();
        Double precio();
        Double total();
        
    }

}
