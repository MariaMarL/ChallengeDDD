package com.sofka.challenge.assessor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.assessor.entities.Estimate;
import com.sofka.challenge.assessor.entities.Invoice;
import com.sofka.challenge.assessor.entities.Tracking;
import com.sofka.challenge.assessor.events.AssessorCreated;
import com.sofka.challenge.assessor.values.AssessorId;
import com.sofka.challenge.assessor.values.Name;

import java.util.List;

public class Assessor extends AggregateEvent<AssessorId> {

    protected Estimate estimate;
    protected Invoice invoice;
    protected Tracking tracking;
    protected Name name;

    public Assessor(AssessorId entityId, Name name) {
        super(entityId);
        appendChange(new AssessorCreated(name)).apply();
    }

    private Assessor(AssessorId assessorId){
        super(assessorId);
        subscribe(new AssessorChanger(this));
    }

    private static Assessor from(AssessorId assessorId, List<DomainEvent> events){
        Assessor assessor = new Assessor(assessorId);
        events.forEach((event)-> assessor.applyEvent(event));
        return assessor;
    }

    public Estimate estimate() {
        return estimate;
    }

    public Invoice invoice() {
        return invoice;
    }

    public Tracking tracking() {
        return tracking;
    }

    public Name name() {
        return name;
    }
}
