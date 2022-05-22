package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.commands.CreateInvoice;

public class CreateInvoiceUseCase extends UseCase<RequestCommand<CreateInvoice>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateInvoice> createInvoiceRequestCommand) {
        var command = createInvoiceRequestCommand.getCommand();

        var sale = Sale.from(command.saleId(),retrieveEvents(command.saleId().value()));

        sale.createInvoice(command.date(),command.value());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
