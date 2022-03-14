package ec.com.proeventos.domain.planificador;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.planificador.valor.InformacionId;
import ec.com.proeventos.domain.planificador.valor.Usuario;

public class Informacion extends Entity<InformacionId>{
    private Usuario usuario;

    public Informacion(InformacionId informacionId, Usuario usuario){
        super(informacionId);
        this.usuario = usuario;
    }

    public Usuario usuario(){
        return usuario;

    }

    public void actualizarUsuario(Usuario uNuevo){
        this.usuario = uNuevo;
    }
}
