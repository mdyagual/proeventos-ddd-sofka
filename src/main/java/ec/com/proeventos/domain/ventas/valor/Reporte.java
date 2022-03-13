package ec.com.proeventos.domain.ventas.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Reporte implements ValueObject<Reporte.Props> {
    private final Integer cantVentas;
    private final boolean bono;
    private final Integer horasExtra;
    private final Fecha fecha;

    public Reporte(Integer cantVentas, boolean bono, Integer horasExtra, Fecha fecha) {
        this.cantVentas = Objects.requireNonNull(cantVentas);
        this.bono = Objects.requireNonNull(bono);
        this.horasExtra = Objects.requireNonNull(horasExtra);
        this.fecha = Objects.requireNonNull(new Fecha());
    }

    @Override
    public Props value (){
        return new Props (){
            @Override
            public Integer cantVentas() {
                return cantVentas;
            }

            @Override
            public boolean bono() {
                return bono;
            }

            @Override
            public Integer horasExtra() {
                return horasExtra;
            }

            @Override
            public Fecha fecha() {
                return fecha;
            }
        };
    }

    public interface Props{
        Integer cantVentas();
        boolean bono();
        Integer horasExtra();
        Fecha fecha();
        
    }


    
}
