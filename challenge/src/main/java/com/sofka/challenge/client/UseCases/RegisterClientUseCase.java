package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.client.Client;
import com.sofka.challenge.client.commands.RegisterClient;

public class RegisterClientUseCase extends UseCase<RequestCommand<RegisterClient>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<RegisterClient> registerClientRequestCommand) {
        var command = registerClientRequestCommand.getCommand();

        var client = Client.from(command.clientId(),retrieveEvents(command.clientId().value()));

        client.registerClient(command.cc(), command.name());

        emit().onResponse(new ResponseEvents(client.getUncommittedChanges()));

    }
}
