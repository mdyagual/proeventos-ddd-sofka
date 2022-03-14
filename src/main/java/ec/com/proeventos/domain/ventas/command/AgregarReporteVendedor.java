package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Reporte;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class AgregarReporteVendedor extends Command {
    private final VendedorId vendedorId;
    //private final Dato datos;
    private final Reporte reporte;
    

    public AgregarReporteVendedor(VendedorId vendedorId, Reporte reporte) {
        this.vendedorId = vendedorId;
        this.reporte = reporte;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    /*public Dato getDatos() {
        return datos;
    }*/

    public Reporte getReporte() {
        return reporte;
    }
    
}
