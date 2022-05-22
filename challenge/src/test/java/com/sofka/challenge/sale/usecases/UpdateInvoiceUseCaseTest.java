package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.sale.commands.UpdateInvoice;
import com.sofka.challenge.sale.events.*;
import com.sofka.challenge.sale.values.*;
import com.sofka.challenge.share.values.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class UpdateInvoiceUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void updateInvoice(){
        var command = new UpdateInvoice(new Date("01-01-2021"), new Value(200000.0), SaleId.of(ROOT_ID));
        var useCase = new UpdateInvoiceUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new SaleCreated(SaleId.of("2"),new Name("Fernanda")),
                new InvoiceCreated(new Date("01-05-2015"), new Value(20000.0), InvoiceId.of("5"))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (InvoiceUpdated)events.get(0);
        Assertions.assertEquals(command.date().value(),event.date().value());
        Assertions.assertEquals(command.value().value(),event.value().value());

    }


}
