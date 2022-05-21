package com.sofka.challenge.assessor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.assessor.values.StatusTracking;

public class TrackingCanceled extends DomainEvent {

    private final StatusTracking statusTracking;

    public TrackingCanceled(StatusTracking statusTracking) {
            super("sofka.client.trackingcanceled");
            this.statusTracking = statusTracking;
    }

    public StatusTracking statusTracking() {
        return statusTracking;
    }
}
