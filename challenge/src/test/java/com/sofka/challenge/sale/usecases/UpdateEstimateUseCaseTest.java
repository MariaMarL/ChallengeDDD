package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.sale.commands.UpdateEstimate;
import com.sofka.challenge.sale.events.EstimateCreated;
import com.sofka.challenge.sale.events.EstimateUpdated;
import com.sofka.challenge.sale.events.SaleCreated;
import com.sofka.challenge.sale.values.EstimateId;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.share.values.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class UpdateEstimateUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void updateEstimate(){
        var command = new UpdateEstimate(new Date("15-04-2021"), new Value(2000.0), EstimateId.of("2"), SaleId.of(ROOT_ID));
        //System.out.println(command.date().value());
        var useCase = new UpdateEstimateUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new SaleCreated(SaleId.of("2"),new Name("Fernanda")),
                new EstimateCreated(EstimateId.of("2"),new Date("01-01-2021"),new Value(1000.0))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (EstimateUpdated)events.get(0);
        Assertions.assertEquals(command.date().value(),event.date().value());
        Assertions.assertEquals(command.value().value(),event.value().value());

    }


}