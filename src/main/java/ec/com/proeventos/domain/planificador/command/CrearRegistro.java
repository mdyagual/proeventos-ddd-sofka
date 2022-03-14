package ec.com.proeventos.domain.planificador.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.planificador.valor.Descripcion;
import ec.com.proeventos.domain.planificador.valor.RegistroId;

public class CrearRegistro extends Command{
    private final RegistroId registroId;
    private final Descripcion descripcion;

    public CrearRegistro(RegistroId registroId, Descripcion descripcion) {
        this.registroId = registroId;
        this.descripcion = descripcion;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    


}
