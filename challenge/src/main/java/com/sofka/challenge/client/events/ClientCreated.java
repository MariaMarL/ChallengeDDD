package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Budget;

public class ClientCreated extends DomainEvent {

    private final Budget budget;


    public ClientCreated(Budget budget) {
        super("sofka.client.clientregistered");
        this.budget = budget;
    }

    public Budget budget() {
        return budget;
    }
}
