package ec.com.proeventos.domain.ventas;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.ventas.valor.ClienteId;
import ec.com.proeventos.domain.ventas.valor.Informacion;

public class Cliente extends Entity<ClienteId>{
    private Informacion informacion;

    public Cliente (ClienteId clienteId, Informacion informacion){
        super(clienteId);
        this.informacion = informacion;
    }

    public Informacion informacion(){
        return informacion;
    }
}
