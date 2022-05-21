package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Cc;
import com.sofka.challenge.client.values.Name;
import com.sofka.challenge.client.values.RegisterId;

public class RegisterClient extends Command {
    private final Name name;
    private final Cc cc;
    private final RegisterId registerId;


    public RegisterClient(Name name, Cc cc, RegisterId registerId) {
        this.name = name;
        this.cc = cc;
        this.registerId = registerId;
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
}
