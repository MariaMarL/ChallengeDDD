package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.client.Client;
import com.sofka.challenge.client.commands.UpdateBrandVehicle;

public class UpdateBrandVehicleUseCase extends UseCase<RequestCommand<UpdateBrandVehicle>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateBrandVehicle> updateBrandVehicleRequestCommand) {

        var command = updateBrandVehicleRequestCommand.getCommand();

        var client = Client.from(command.clientId(),retrieveEvents(command.clientId().value()));

        client.updateBrandVehicle(command.brand());

        emit().onResponse(new ResponseEvents(client.getUncommittedChanges()));
    }
}
