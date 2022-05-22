package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Budget;
import com.sofka.challenge.client.values.ClientId;

public class CreateClient extends Command {

    private final Budget budget;
    private final ClientId clientd;


    public CreateClient(Budget budget, ClientId clientId) {
        this.budget = budget;
        this.clientd = clientId;
    }

    public Budget budget() {
        return budget;
    }

    public ClientId client() {
        return clientd;
    }
}
