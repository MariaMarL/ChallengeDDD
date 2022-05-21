package com.sofka.challenge.assessor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.assessor.values.Name;

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
