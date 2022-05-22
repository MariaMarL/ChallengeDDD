package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.commands.UpdateEstimate;

public class UpdateEstimateUseCase extends UseCase<RequestCommand<UpdateEstimate>, ResponseEvents> {
    @Override
        public void executeUseCase(RequestCommand<UpdateEstimate> updateEstimateRequestCommand) {
            var command = updateEstimateRequestCommand.getCommand();
            var sale = Sale.from(command.saleId(), retrieveEvents(command.saleId().value()));
            sale.updateEstimate(command.date(), command.value());
            emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
        }
    }

