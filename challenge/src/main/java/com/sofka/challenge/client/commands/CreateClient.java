package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Budget;
import com.sofka.challenge.client.values.ClientId;

public class CreateClient extends Command {

    private final Budget budget;
    private final ClientId client;


    public CreateClient(Budget budget, ClientId client) {
        this.budget = budget;
        this.client = client;
    }

    public Budget budget() {
        return budget;
    }

    public ClientId client() {
        return client;
    }
}
