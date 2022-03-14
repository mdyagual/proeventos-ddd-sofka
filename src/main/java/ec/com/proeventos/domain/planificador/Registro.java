package ec.com.proeventos.domain.planificador;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.planificador.valor.Descripcion;
import ec.com.proeventos.domain.planificador.valor.RegistroId;

public class Registro extends Entity<RegistroId> {
    private Descripcion descripcion;

    public  Registro(RegistroId registroId, Descripcion descripcion){
        super(registroId);
        this.descripcion = descripcion;
    }

    public Descripcion descripcion(){
        return descripcion;

    }

    public void actualizarUsuario(Descripcion descripcionNueva){
        this.descripcion =  descripcionNueva;
    }


}
