package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Informacion;

public class CrearCliente extends Command {
    private final Informacion informacion;

    public CrearCliente(Informacion informacion) {
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    

    
}
