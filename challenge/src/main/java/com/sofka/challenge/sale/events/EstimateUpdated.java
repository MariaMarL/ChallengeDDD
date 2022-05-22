package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.EstimateId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.share.values.Date;

public class EstimateUpdated extends DomainEvent {

    private final Date date;
    private final Value value;

    public EstimateUpdated(Date date, Value value) {
        super("sofka.sale.estimateupdated");
        this.date = date;
        this.value = value;
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }


}
