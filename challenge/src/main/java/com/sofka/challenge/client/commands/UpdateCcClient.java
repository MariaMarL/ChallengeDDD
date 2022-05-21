package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Cc;
import com.sofka.challenge.client.values.ClientId;

public class UpdateCcClient extends Command {
    private final Cc cc;
    private final ClientId client;

    public UpdateCcClient(Cc cc, ClientId client) {
        this.cc = cc;
        this.client = client;
    }

    public Cc cc() {
        return cc;
    }

    public ClientId client() {
        return client;
    }
}
