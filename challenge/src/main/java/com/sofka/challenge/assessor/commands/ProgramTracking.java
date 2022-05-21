package com.sofka.challenge.assessor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.assessor.values.StatusTracking;
import com.sofka.challenge.assessor.values.TrackingId;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class ProgramTracking extends Command {

    private final Date date;
    private final StatusTracking statusTracking;
    private final TrackingId trackingId;
    private final RegisterId registerId;


    public ProgramTracking(Date date,
                             StatusTracking statusTracking,
                             TrackingId trackingId,
                             RegisterId registerId) {
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
