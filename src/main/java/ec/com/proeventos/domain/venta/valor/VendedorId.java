package ec.com.proeventos.domain.venta.valor;

import co.com.sofka.domain.generic.Identity;

public class VendedorId extends Identity {
    private VendedorId(String valor){
        super(valor);
    }

    public VendedorId(){}

    public static VendedorId of (String valor){
        return new VendedorId(valor);
    }
}
