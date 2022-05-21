package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.Name;

public class UpdateNameClient extends Command {

    private final Name name;
    private final ClientId client;


    public UpdateNameClient(Name name, ClientId client) {
        this.name = name;
        this.client = client;
    }

    public Name name() {
        return name;
    }


    public ClientId client() {
        return client;
    }
}

