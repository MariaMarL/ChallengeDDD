package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.entities.Invoice;
import com.sofka.challenge.sale.events.InvoiceCreated;
import com.sofka.challenge.sale.events.SaleCreated;

public class CreateSaleByEventUseCase extends UseCase<TriggeredEvent<SaleCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<SaleCreated> saleCreatedTriggeredEvent) {

        var event = saleCreatedTriggeredEvent.getDomainEvent();

        var sale = new Sale(event.saleId(), event.name());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
