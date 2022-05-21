package com.sofka.challenge.assessor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.assessor.values.EstimateId;
import com.sofka.challenge.assessor.values.Value;
import com.sofka.challenge.share.values.Date;

public class EstimateCreated extends DomainEvent {
    private final Date date;
    private final Value value;
    private final EstimateId estimateId;


    public EstimateCreated(String type, Date date, Value value, EstimateId estimateId) {
        super("sofka.assessor.estimatecreated");
        this.date = date;
        this.value = value;
        this.estimateId = estimateId;
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }

    public EstimateId estimateId() {
        return estimateId;
    }
}
