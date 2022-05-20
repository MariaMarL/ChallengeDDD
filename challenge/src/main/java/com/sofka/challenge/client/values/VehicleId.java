package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.Identity;

public class VehicleId extends Identity {

    public VehicleId() {
    }

    private VehicleId(String uuid) {
        super(uuid);
    }

    public static VehicleId of(String Id){
        return new VehicleId(Id);
    }

}
