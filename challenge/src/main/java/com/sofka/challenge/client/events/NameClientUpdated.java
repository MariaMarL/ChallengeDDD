package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Name;

public class NameClientUpdated extends DomainEvent {
    private final Name name;


    public NameClientUpdated(Name name) {
        super("sofka.client.nameclientupdated");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
