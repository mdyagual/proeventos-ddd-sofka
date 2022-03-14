package ec.com.proeventos.domain.venta.valor;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Informacion implements ValueObject<Informacion.Props> {
    private final String nombre;
    private final String apellido;
    private final String tipoIdentificacion;
    private final String identificacion;
    private final Direccion direccion;

    public Informacion (String nombre, String apellido, String tipoIdentificacion, String identificacion, Direccion direccion){
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
        this.tipoIdentificacion = Objects.requireNonNull(tipoIdentificacion);
        this.identificacion = Objects.requireNonNull(identificacion);
        this.direccion = Objects.requireNonNull(direccion);
    }

    @Override
    public Props value (){
        return new Props (){
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }

            @Override
            public String tipoIdentificacion() {
                return tipoIdentificacion;
            }

            @Override
            public String identificacion() {
                return identificacion;
            }

            @Override
            public Direccion direccion(){
                return direccion;
            }
            
        };
    }

    public Informacion actualizarDireccion(Direccion d){
        return new Informacion(this.nombre,this.apellido,this.tipoIdentificacion,this.identificacion,d);
    }
    
    public interface Props{
        String nombre();
        String apellido();
        String tipoIdentificacion();
        String identificacion();
        Direccion direccion();
    }


}
