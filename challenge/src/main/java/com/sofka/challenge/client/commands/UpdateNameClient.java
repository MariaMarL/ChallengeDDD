package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Name;

public class UpdateNameClient extends Command {

    private final Name name;


    public UpdateNameClient(Name name) {
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
