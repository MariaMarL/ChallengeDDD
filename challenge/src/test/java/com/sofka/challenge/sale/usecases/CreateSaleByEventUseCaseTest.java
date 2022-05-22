package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.challenge.sale.events.SaleCreated;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.SaleId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateSaleByEventUseCaseTest {

    private final String SALE_ROOT_ID = "12";

    @Test
    void createSale(){
        var event1 = new SaleCreated(SaleId.of(SALE_ROOT_ID),new Name("Maria"));

        var useCase = new CreateSaleByEventUseCase();
        var events = UseCaseHandler.getInstance().setIdentifyExecutor(SALE_ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event1))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (SaleCreated)events.get(0);
        Assertions.assertEquals(event1.name().value(),event.name().value());
    }

}