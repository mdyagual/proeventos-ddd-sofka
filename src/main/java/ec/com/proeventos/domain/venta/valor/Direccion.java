package ec.com.proeventos.domain.ventas.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject <Direccion.Props> {
    private final String sector;
    private final String parroquia;
    private final String callePrincipal;
    private final String calleSecundaria;
    private final String numeroDir;
    
    public Direccion(String sector, String parroquia, String callePrincipal, String calleSecundaria, String numeroDir){
        this.sector = Objects.requireNonNull(sector);
        this.parroquia = Objects.requireNonNull(parroquia);
        this.callePrincipal = Objects.requireNonNull(callePrincipal);
        this.calleSecundaria = Objects.requireNonNull(calleSecundaria);
        this.numeroDir = Objects.requireNonNull(numeroDir);
        
    }

    @Override
    public Props value (){
        return new Props (){
            @Override
            public String sector() {
                return sector;
            }

            @Override
            public String parroquia() {
                return parroquia;
            }

            @Override
            public String callePrincipal() {
                return callePrincipal;
            }

            @Override
            public String calleSecundaria() {
                return calleSecundaria;
            }

            @Override
            public String numeroDir(){
                return numeroDir;
            }
        };
    }

    public interface Props{
        String sector();
        String parroquia();
        String callePrincipal();
        String calleSecundaria();
        String numeroDir();
    }
}
