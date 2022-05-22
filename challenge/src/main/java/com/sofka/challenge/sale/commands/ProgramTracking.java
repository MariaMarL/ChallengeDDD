package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.StatusTracking;
import com.sofka.challenge.sale.values.TrackingId;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class ProgramTracking extends Command {

    private final Date date;
    private final StatusTracking statusTracking;
    private final TrackingId trackingId;
    private final SaleId saleId;


    public ProgramTracking(Date date,
                           StatusTracking statusTracking,
                           TrackingId trackingId,
                           SaleId saleId) {
        this.date = date;
        this.statusTracking = statusTracking;
        this.trackingId = trackingId;
        this.saleId = saleId;
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

    public SaleId saleId() {
        return saleId;
    }
}
