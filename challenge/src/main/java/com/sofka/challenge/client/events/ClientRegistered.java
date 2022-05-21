package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Cc;
import com.sofka.challenge.client.values.Name;
import com.sofka.challenge.client.values.RegisterId;

public class ClientRegistered extends DomainEvent {
    private final Name name;
    private final Cc cc;
    private final RegisterId registerId;


    public ClientRegistered(Name name, Cc cc, RegisterId registerId) {
        super("sofka.client.clientregistered");
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
