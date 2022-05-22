package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.commands.CancelTracking;

public class CancelTrackingUseCase extends UseCase<RequestCommand<CancelTracking>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CancelTracking> cancelTrackingRequestCommand) {
        var command =  cancelTrackingRequestCommand.getCommand();

        var sale = Sale.from(command.saleId(), retrieveEvents(command.saleId().value()));

        sale.cancelTracking();

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));

    }
}
