package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.client.Client;
import com.sofka.challenge.client.commands.UpdateColorVehicle;

public class UpdateColorVehicleUseCase extends UseCase<RequestCommand<UpdateColorVehicle>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateColorVehicle> updateColorVehicleRequestCommand) {
        var command = updateColorVehicleRequestCommand.getCommand();

        var client = Client.from(command.clientId(),retrieveEvents(command.clientId().value()));

        client.updateColorVehicle(command.color());

        emit().onResponse(new ResponseEvents( client.getUncommittedChanges()));
    }
}
