package ec.com.proeventos.domain.venta.usecases;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import ec.com.proeventos.domain.venta.valor.Informacion;
import ec.com.proeventos.domain.venta.valor.Pago;
import ec.com.proeventos.domain.venta.valor.VendedorId;
import ec.com.proeventos.domain.venta.valor.VentaId;
import ec.com.proeventos.domain.venta.Cliente;
import ec.com.proeventos.domain.venta.Contrato;
import ec.com.proeventos.domain.venta.Vendedor;
import ec.com.proeventos.domain.venta.command.CrearCliente;
import ec.com.proeventos.domain.venta.event.ClienteCreado;
import ec.com.proeventos.domain.venta.event.VentaCreada;
import ec.com.proeventos.domain.venta.valor.ClienteId;
import ec.com.proeventos.domain.venta.valor.ContratoId;
import ec.com.proeventos.domain.venta.valor.Dato;
import ec.com.proeventos.domain.venta.valor.Direccion;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CrearClienteUseCaseTest {
    @Mock
    private DomainEventRepository repository;
    
    @Test
    void crearCliente(){       
        
        //Arange
        VentaId ventaId = VentaId.of("venta1");
        
        ClienteId clienteId = ClienteId.of("cliente1");
        Direccion direccion = new Direccion("Sur","Urdaneta","CP1","CP2","544");
        Informacion informacion = new Informacion("Juan","Reyes","Cédula","0931452668",direccion);
        //Cliente cliente = new Cliente(clienteId,informacion);
        
        var command = new CrearCliente(ventaId,clienteId,informacion);

        
        var useCase = new CrearClienteUseCase();

        Mockito.when(repository.getEventsBy("venta1")).thenReturn(history());
        useCase.addRepository(repository);
        //Act
        

        var events = UseCaseHandler.getInstance()
        .setIdentifyExecutor(ventaId.value())
        .syncExecutor(useCase, new RequestCommand<>(command))
        .orElseThrow()
        .getDomainEvents();

        //Asset
        var event = (ClienteCreado) events.get(0);
        Assertions.assertEquals("venta.clientecreado", event.type);
        Assertions.assertEquals("venta1", event.aggregateRootId());
        Assertions.assertEquals(clienteId, event.getClienteId());
        Assertions.assertEquals(informacion, event.getInformacion());

        
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
                        new ClienteCreado(clienteId, informacion)
                );
    }
    
}
