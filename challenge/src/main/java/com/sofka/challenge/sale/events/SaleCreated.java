package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.Name;

public class AssessorCreated extends DomainEvent {

    private final Name name;


    public AssessorCreated(Name name) {
        super("sofka.assessor.assessorcreated");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
