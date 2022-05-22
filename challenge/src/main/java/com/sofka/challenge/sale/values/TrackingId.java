package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;

public class TrackingId extends Identity {

    public TrackingId() {
    }

    private TrackingId(String uuid) {
        super(uuid);
    }

    public static TrackingId of(String Id){
        return new TrackingId(Id);
    }


}
