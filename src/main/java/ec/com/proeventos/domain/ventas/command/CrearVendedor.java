package ec.com.proeventos.domain.ventas.command;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.Reporte;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class CrearVendedor extends Command{
    private final VendedorId vendedorId;
    private final Dato datos;
    private final List<Reporte> reportes;
    
    public CrearVendedor(VendedorId vendedorId, Dato datos, List<Reporte> reportes) {
        this.vendedorId = vendedorId;
        this.datos = datos;
        this.reportes = new ArrayList<>();
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Dato getDatos() {
        return datos;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    

    
}
