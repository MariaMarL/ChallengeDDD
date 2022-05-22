package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Budget;
import com.sofka.challenge.client.values.ClientId;

public class ClientCreated extends DomainEvent {

    private final Budget budget;
    private final ClientId clientId;


    public ClientCreated(Budget budget, ClientId clientId) {
        super("sofka.client.clientregistered");
        this.budget = budget;
        this.clientId = clientId;
    }

    public Budget budget() {
        return budget;
    }

    public ClientId clientId() {
        return clientId;
    }
}
