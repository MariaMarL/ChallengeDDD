package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.StatusTracking;
import com.sofka.challenge.sale.values.TrackingId;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class TrackingProgramed extends DomainEvent {

    private final Date date;
    private final StatusTracking statusTracking;
    private final TrackingId trackingId;


    public TrackingProgramed(Date date,
                             StatusTracking statusTracking,
                             TrackingId trackingId) {
        super("sofka.sale.trackingprogramed");
        this.date = date;
        this.statusTracking = statusTracking;
        this.trackingId = trackingId;
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

}
