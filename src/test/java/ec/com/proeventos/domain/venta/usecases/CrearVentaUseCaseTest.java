package ec.com.proeventos.domain.venta.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import ec.com.proeventos.domain.venta.valor.Informacion;
import ec.com.proeventos.domain.venta.valor.Pago;
import ec.com.proeventos.domain.venta.valor.VendedorId;
import ec.com.proeventos.domain.venta.valor.Fecha;
import ec.com.proeventos.domain.venta.Cliente;
import ec.com.proeventos.domain.venta.Contrato;
import ec.com.proeventos.domain.venta.Vendedor;
import ec.com.proeventos.domain.venta.command.CrearVenta;
import ec.com.proeventos.domain.venta.event.VentaCreada;
import ec.com.proeventos.domain.venta.valor.ClienteId;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.Direccion;
import ec.com.proeventos.domain.venta.valor.VentaId;

class CrearVentaUseCaseTest {
    @Test
    void crearVenta(){
        //Arange
        VentaId ventaId = VentaId.of("venta1");

        ClienteId clienteId = ClienteId.of("cliente1");
        Direccion direccion = new Direccion("Sur","Urdaneta","CP1","CP2","544");
        Informacion informacion = new Informacion("Juan","Reyes","Cédula","0931452668",direccion);
        Cliente cliente = new Cliente(clienteId,informacion);

        VendedorId vendedorId = VendedorId.of("vendedorA");
        Dato datos = new Dato("Norma","Elizondo","Sur");
        Vendedor vendedor = new Vendedor(vendedorId,datos);

        ContratoId contratoId = ContratoId.of("contratoA");
        Pago pago = new Pago("Tarjeta crédito",6,0.03,800.0);
        Contrato contrato = new Contrato(contratoId,800.0,pago);

        CrearVenta venta = new CrearVenta (ventaId,cliente,vendedor,contrato);

        //Act
        CrearVentaUseCase useCase = new CrearVentaUseCase();

        var events = UseCaseHandler.getInstance()
        .syncExecutor(useCase, new RequestCommand<>(venta))
        .orElseThrow()
        .getDomainEvents();

        //Asset
        var event = (VentaCreada) events.get(0);
        Assertions.assertEquals("venta.ventacreada", event.type);
        Assertions.assertEquals("venta1", event.aggregateRootId());
        Assertions.assertEquals(cliente, event.getCliente());
        Assertions.assertEquals(vendedor, event.getVendedor());
        Assertions.assertEquals(contrato, event.getContrato());



    }
    
}
