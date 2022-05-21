package com.sofka.challenge.assessor.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.assessor.values.StatusTracking;
import com.sofka.challenge.assessor.values.TrackingId;
import com.sofka.challenge.client.values.RegisterId;

import java.util.Date;

public class Tracking extends Entity<TrackingId> {
    private Date date;
    private StatusTracking statusTracking;
    private RegisterId registerId;


    public Tracking(TrackingId entityId,
                    Date date,
                    StatusTracking statusTracking,
                    RegisterId registerId) {
        super(entityId);
        this.date=date;
        this.statusTracking=statusTracking;;
        this.registerId=registerId;
    }
}
