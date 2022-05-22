package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.commands.UpdateEstimate;
import com.sofka.challenge.sale.commands.UpdateInvoice;

public class UpdateInvoiceUseCase extends UseCase<RequestCommand<UpdateInvoice>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateInvoice> updateInvoiceRequestCommand) {
        var command = updateInvoiceRequestCommand.getCommand();
        var sale = Sale.from(command.saleId(),retrieveEvents(command.saleId().value()));

    sale.updateInvoice(command.date(), command.value());

    emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}

