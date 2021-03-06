package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Cc;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.Name;
import com.sofka.challenge.client.values.RegisterId;

public class RegisterClient extends Command {
    private final Name name;
    private final Cc cc;
    private final RegisterId registerId;
    private final ClientId clientId;

    public RegisterClient(Name name, Cc cc, RegisterId registerId, ClientId clientId) {
        this.name = name;
        this.cc = cc;
        this.registerId = registerId;
        this.clientId = clientId;
    }

    public Name name() {
        return name;
    }

    public Cc cc() {
        return cc;
    }

    public RegisterId registerId() {
        return registerId;
    }

    public ClientId clientId() {
        return clientId;
    }
}

