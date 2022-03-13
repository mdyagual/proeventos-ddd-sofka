package ec.com.proeventos.domain.ventas;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.Entity;
import ec.com.proeventos.domain.ventas.valor.Dato;
import ec.com.proeventos.domain.ventas.valor.Reporte;
import ec.com.proeventos.domain.ventas.valor.VendedorId;

public class Vendedor extends Entity<VendedorId> {
    private Dato datos;
    private List<Reporte> reportes;

    public Vendedor (VendedorId vendedorId, Dato datos){
        super(vendedorId);
        this.datos = datos;
        this.reportes = new ArrayList<>();
    }

    public Dato datos(){
        return datos;
    }

    public List<Reporte> reportes(){
        return reportes;
    }
    
    //actualizar Datos
    public void actualizarDatos(Dato d){
        this.datos=d;
    }

    //agregar reportes
    public void agregarReporte(Reporte r){
        reportes.add(r);
    }

    //actualizar reportes
    public void actualizarReporte(Reporte r){
        this.reportes.add(r);
    }

    //eliminar reportes
    public void eliminarReporte(Reporte r){

    }

    


}
