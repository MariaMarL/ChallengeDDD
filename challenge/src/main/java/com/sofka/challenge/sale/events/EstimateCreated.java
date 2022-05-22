package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.EstimateId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.share.values.Date;

public class EstimateCreated extends DomainEvent {
    private final Date date;
    private final Value value;
    private final EstimateId estimateId;


    public EstimateCreated(EstimateId estimateId, Date date, Value value) {
        super("sofka.sale.estimatecreated");
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
