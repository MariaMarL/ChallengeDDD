package com.sofka.challenge.assessor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.share.values.Date;

public class TrackingUpdated extends DomainEvent {

    private final Date date;


    public TrackingUpdated(Date date) {
        super("sofka.client.trackingupdated");
        this.date = date;
    }

    public Date date() {
        return date;
    }
}
