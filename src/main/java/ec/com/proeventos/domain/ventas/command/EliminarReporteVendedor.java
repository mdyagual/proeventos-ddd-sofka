package ec.com.proeventos.domain.ventas.command;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Reporte;

public class EliminarReporteVendedor extends Command {
    private final Reporte reporte;

    public EliminarReporteVendedor (Reporte reporte) {
       
        this.reporte = reporte;
    }

    public Reporte getReporte() {
        return reporte;
    }

    
}
