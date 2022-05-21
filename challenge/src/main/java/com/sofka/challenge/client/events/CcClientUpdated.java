package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Cc;

public class CcClientUpdated extends DomainEvent {

    private final Cc cc;


    public CcClientUpdated(Cc cc) {
        super("sofka.client.ccclientupdated");
        this.cc = cc;
    }

    public Cc cc() {
        return cc;
    }
}
