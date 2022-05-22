package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.commands.CreateEstimate;
import com.sofka.challenge.sale.commands.CreateSale;

public class CreateEstimateUseCase extends UseCase<RequestCommand<CreateEstimate>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateEstimate> createEstimateRequestCommand) {
        var command = createEstimateRequestCommand.getCommand();

        var sale = Sale.from(command.saleId(),retrieveEvents(command.saleId().value()));

        sale.createEstimate( command.date(), command.value());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
