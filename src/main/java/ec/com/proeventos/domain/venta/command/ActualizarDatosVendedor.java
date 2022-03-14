package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class ActualizarDatosVendedor extends Command{
    private final VendedorId vendedorId;
    private final Dato datos;


    public ActualizarDatosVendedor(VendedorId vendedorId, Dato datos) {
        this.vendedorId = vendedorId;
        this.datos = datos;
    }


    public VendedorId getVendedorId() {
        return vendedorId;
    }


    public Dato getDatos() {
        return datos;
    }

    

    

    
}
