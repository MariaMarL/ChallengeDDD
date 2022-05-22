package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.challenge.client.events.ClientCreated;
import com.sofka.challenge.client.values.Budget;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.sale.events.SaleCreated;
import com.sofka.challenge.sale.usecases.CreateSaleByEventUseCase;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.SaleId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CreateClientByEventUseClaseTest {

    private final String ROOT_ID = "1";

    @Test
    void createClient(){
        var event1 = new ClientCreated(new Budget(200000L), ClientId.of(ROOT_ID));

        var useCase = new CreateClientByEventUseClase();
        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event1))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (ClientCreated)events.get(0);
        Assertions.assertEquals(event1.budget().value(),event.budget().value());
    }

}