package ec.com.proeventos.domain.ventas.command;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Command;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.Reporte;
import ec.com.proeventos.domain.ventas.valor.VendedorId;
import ec.com.proeventos.domain.ventas.valor.VentaId;

public class CrearVendedor extends Command{
    private final VentaId ventaId;
    private final VendedorId vendedorId;
    private final Dato datos;
    private final List<Reporte> reportes;
    
    public CrearVendedor(VentaId ventaId,VendedorId vendedorId, Dato datos, List<Reporte> reportes) {
        this.ventaId = ventaId;
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

    public VentaId getVentaId() {
        return ventaId;
    }

    

    

    
}
