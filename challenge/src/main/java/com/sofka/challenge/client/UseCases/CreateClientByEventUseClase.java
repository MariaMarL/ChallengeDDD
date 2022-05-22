package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.challenge.client.Client;
import com.sofka.challenge.client.events.ClientCreated;

public class CreateClientByEventUseClase extends UseCase<TriggeredEvent<ClientCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<ClientCreated> clientCreatedTriggeredEvent) {

        var event = clientCreatedTriggeredEvent.getDomainEvent();

        var client = new Client(event.clientId(),event.budget());

        emit().onResponse(new ResponseEvents(client.getUncommittedChanges()));

    }
}
