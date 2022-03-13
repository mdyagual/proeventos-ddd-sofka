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
        this.datos = d;
    }

    //agregar reportes
    public void agregarReporte(Reporte r){
        this.reportes.add(r);
    }

    //actualizar reportes
    public void actualizarReporte(Reporte r){
        if(this.reportes.contains(r)){
            this.reportes.remove(this.reportes.indexOf(r));
            this.reportes.add(r);
        }else{
            System.out.println("No existe el reporte ingresado");
        }
    }

    //eliminar reportes
    public void eliminarReporte(Reporte r){
        if(this.reportes.contains(r)){
            this.reportes.remove(this.reportes.indexOf(r));
        }else{
            System.out.println("No existe el reporte ingresado");
        }

    }

    


}
