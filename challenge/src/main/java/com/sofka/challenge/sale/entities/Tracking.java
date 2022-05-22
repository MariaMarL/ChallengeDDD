package com.sofka.challenge.sale.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.sale.values.StatusTracking;
import com.sofka.challenge.sale.values.TrackingId;
import com.sofka.challenge.share.values.Date;


public class Tracking extends Entity<TrackingId> {
    private Date date;
    private StatusTracking state;


    public Tracking(TrackingId entityId, Date date) {
        super(entityId);
        this.date=date;
        this.state =new StatusTracking(StatusTracking.Option.PROGRAMMED);;;

    }

    public void ProgramTracking(Date date, StatusTracking state) {
        this.date = date;
        this.state = new StatusTracking(StatusTracking.Option.PROGRAMMED);
    }

    public void CancelTracking() {
        this.state = new StatusTracking(StatusTracking.Option.CANCEL);
    }

    public Date date() {
        return date;
    }

    public StatusTracking statusTracking() {
        return state;
    }

}
