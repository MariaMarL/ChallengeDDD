package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.client.Client;
import com.sofka.challenge.client.commands.DefineVehicle;

public class DefineVehicleUseCase extends UseCase<RequestCommand<DefineVehicle>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<DefineVehicle> defineVehicleRequestCommand) {

        var command = defineVehicleRequestCommand.getCommand();

        var client = Client.from(command.clientId(),retrieveEvents(command.clientId().value()));

        client.defineVehicle(command.brand(), command.color());

        emit().onResponse(new ResponseEvents(client.getUncommittedChanges()));

    }
}
