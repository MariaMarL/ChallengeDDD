package com.sofka.challenge.assessor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.assessor.values.StatusTracking;
import com.sofka.challenge.assessor.values.TrackingId;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class TrackingProgramed extends DomainEvent {

    private final Date date;
    private final StatusTracking statusTracking;
    private final TrackingId trackingId;
    private final RegisterId registerId;


    public TrackingProgramed(Date date,
                             StatusTracking statusTracking,
                             TrackingId trackingId,
                             RegisterId registerId) {
        super("sofka.assessor.trackingprogramed");
        this.date = date;
        this.statusTracking = statusTracking;
        this.trackingId = trackingId;
        this.registerId = registerId;
    }

    public Date date() {
        return date;
    }

    public StatusTracking statusTracking() {
        return statusTracking;
    }

    public TrackingId trackingId() {
        return trackingId;
    }

    public RegisterId registerId() {
        return registerId;
    }
}
