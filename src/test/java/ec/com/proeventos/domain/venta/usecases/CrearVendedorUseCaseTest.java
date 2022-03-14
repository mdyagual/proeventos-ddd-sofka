package ec.com.proeventos.domain.venta.usecases;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.valor.ClienteId;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.Direccion;
import ec.com.proeventos.domain.venta.valor.Pago;
import ec.com.proeventos.domain.venta.valor.VendedorId;
import ec.com.proeventos.domain.venta.valor.VentaId;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ec.com.proeventos.domain.venta.valor.Informacion;
import ec.com.proeventos.domain.venta.Cliente;
import ec.com.proeventos.domain.venta.Contrato;
import ec.com.proeventos.domain.venta.Vendedor;
import ec.com.proeventos.domain.venta.command.CrearVendedor;
import ec.com.proeventos.domain.venta.event.VendedorCreado;
import ec.com.proeventos.domain.venta.event.VentaCreada;

@ExtendWith(MockitoExtension.class)
class CrearVendedorUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void CrearVendedor(){
        //Arange
        VentaId ventaId = VentaId.of("venta1");

        VendedorId vendedorId = VendedorId.of("vendedorA");
        Dato datos = new Dato("Norma","Elizondo","Sur");

        var command = new CrearVendedor(ventaId, vendedorId, datos);
        
        var useCase = new CrearVendedorUseCase();

        Mockito.when(repository.getEventsBy("venta1")).thenReturn(history());
        useCase.addRepository(repository);

        //Act  
        var events = UseCaseHandler.getInstance()
        .setIdentifyExecutor(ventaId.value())
        .syncExecutor(useCase, new RequestCommand<>(command))
        .orElseThrow()
        .getDomainEvents();

        //Asset
        var event = (VendedorCreado) events.get(0);
        Assertions.assertEquals("venta.vendedorcreado", event.type);
        Assertions.assertEquals("venta1", event.aggregateRootId());
        Assertions.assertEquals(vendedorId, event.getVendedorId());
        Assertions.assertEquals(datos, event.getDatos());

    }
    
    private List<DomainEvent> history() {
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

        return List.of(
                    new VentaCreada(vendedor,cliente,contrato),
                    new VendedorCreado(vendedorId, datos)
            );
}
}
