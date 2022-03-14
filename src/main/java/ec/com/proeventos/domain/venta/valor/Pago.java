package ec.com.proeventos.domain.venta.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Pago implements ValueObject<Pago.Props> {
    private final String tipoPago;
    private final Integer mesesDiferidos;
    private final Double interesAdicional;
    private final Double valor;

    public Pago (String tipoPago, Integer mesesDiferidos, Double interesAdicional, Double valor){
        this.tipoPago = Objects.requireNonNull(tipoPago);
        this.mesesDiferidos = Objects.requireNonNull(mesesDiferidos);
        this.interesAdicional = Objects.requireNonNull(interesAdicional);
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Props value (){
        return new Props (){
            @Override
            public String tipoPago() {
                return tipoPago;
            }

            @Override
            public Integer mesesDiferidos() {
                return mesesDiferidos;
            }

            @Override
            public Double interesAdicional() {
                return interesAdicional;
            }

            @Override
            public Double valor() {
                return valor;
            }

            
        };
    }

    public interface Props{
        String tipoPago();
        Integer mesesDiferidos();
        Double interesAdicional();
        Double valor();
        
    }
}
