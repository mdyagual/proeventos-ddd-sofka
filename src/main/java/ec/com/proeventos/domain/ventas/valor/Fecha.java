package ec.com.proeventos.domain.ventas.valor;

import java.util.Date;

import co.com.sofka.domain.generic.ValueObject;

public class Fecha implements ValueObject<Date> {
    private final Date valor;

    public Fecha(Date valor) {
        this.valor = valor; 
    }

    public Fecha() {
       this(new Date());
    }

    @Override
    public Date value() {
        return valor;
    }
}
