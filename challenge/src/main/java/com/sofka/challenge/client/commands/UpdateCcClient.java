package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Cc;
import com.sofka.challenge.client.values.ClientId;

public class UpdateCcClient extends Command {
    private final Cc cc;
    private final ClientId clientId;

    public UpdateCcClient(Cc cc, ClientId clientId) {
        this.cc = cc;
        this.clientId = clientId;
    }

    public Cc cc() {
        return cc;
    }

    public ClientId clientId() {
        return clientId;
    }
}
