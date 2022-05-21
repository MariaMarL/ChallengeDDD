package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Cc;

public class UpdateCcClient extends Command {
    private final Cc cc;

    public UpdateCcClient(Cc cc) {
        this.cc = cc;
    }

    public Cc cc() {
        return cc;
    }
}
