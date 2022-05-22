package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.StatusTracking;

public class TrackingCanceled extends DomainEvent {

    public TrackingCanceled() {
            super("sofka.sale.trackingcanceled");

    }

}
