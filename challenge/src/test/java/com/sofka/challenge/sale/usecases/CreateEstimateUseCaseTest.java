package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.sale.commands.CreateEstimate;
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

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CreateEstimateUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void createEstimate(){
        var command = new CreateEstimate(new Date("01-01-2021"), new Value(300000.0),EstimateId.of("1"),SaleId.of(ROOT_ID));
        var useCase = new CreateEstimateUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new SaleCreated(SaleId.of("2"),new Name("Fernanda"))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (EstimateCreated)events.get(0);
        Assertions.assertEquals(command.date().value(), event.date().value());
//        Assertions.assertEquals(command.date().value(),event.date().value());
        Assertions.assertEquals(command.value().value(),event.value().value());

    }}